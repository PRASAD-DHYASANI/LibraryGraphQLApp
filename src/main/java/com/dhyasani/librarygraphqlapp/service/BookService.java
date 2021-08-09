package com.dhyasani.librarygraphqlapp.service;

import com.dhyasani.librarygraphqlapp.dto.Book;
import com.dhyasani.librarygraphqlapp.dto.BookInput;
import com.dhyasani.librarygraphqlapp.entity.BookEntity;
import com.dhyasani.librarygraphqlapp.repository.BookRepository;
import com.dhyasani.librarygraphqlapp.util.ObjectMapperUtil;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {

    @Resource
    private BookRepository bookRepository;

    public Book find(String id){
        return ObjectMapperUtil.map(bookRepository.findById(id).get(),Book.class);
    }

    public List<Book> findAll(){
       List<BookEntity> bookEntities = bookRepository.findAll();
        return ObjectMapperUtil.mapList(bookEntities, Book.class);
    }

    public Book createBook(BookInput book){
        BookEntity bookEntity = bookRepository.save(ObjectMapperUtil.map(book,BookEntity.class));
        return ObjectMapperUtil.map(bookEntity,Book.class);
    }

    public Boolean delete(String id){
        bookRepository.deleteById(id);
        return Boolean.TRUE;
    }

}
