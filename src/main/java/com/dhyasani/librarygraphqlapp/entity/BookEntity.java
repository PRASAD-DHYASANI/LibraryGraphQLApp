package com.dhyasani.librarygraphqlapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@Document(collection = "book")
public class BookEntity {
    @Id
    private String id;
    private String isbn;
    private String  name;
    private String author;

}
