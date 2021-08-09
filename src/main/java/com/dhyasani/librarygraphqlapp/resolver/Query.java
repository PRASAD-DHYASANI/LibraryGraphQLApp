package com.dhyasani.librarygraphqlapp.resolver;


import com.dhyasani.librarygraphqlapp.dto.Book;
import com.dhyasani.librarygraphqlapp.service.BookService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Resource
    private BookService bookService;

    public List<Book> getAllBooks() {
        return bookService.findAll();
    }

    public Book getBook(String id){
        return bookService.find(id);
    }


}
