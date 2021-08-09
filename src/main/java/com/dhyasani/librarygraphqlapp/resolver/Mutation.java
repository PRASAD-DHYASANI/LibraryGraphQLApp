package com.dhyasani.librarygraphqlapp.resolver;

import com.dhyasani.librarygraphqlapp.dto.Book;
import com.dhyasani.librarygraphqlapp.dto.BookInput;
import com.dhyasani.librarygraphqlapp.service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    private BookService bookService;

    @Autowired
    public Mutation(BookService bookService) {
        this.bookService = bookService;
    }

    public Book addBook(BookInput book) {

        Book reponse = bookService.createBook(book);

        return reponse;
    }

    public boolean deleteBook(String id) {
        bookService.delete(id);
        return true;
    }

}
