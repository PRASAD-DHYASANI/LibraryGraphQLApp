package com.dhyasani.librarygraphqlapp.repository;

import com.dhyasani.librarygraphqlapp.entity.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<BookEntity,String> {
}
