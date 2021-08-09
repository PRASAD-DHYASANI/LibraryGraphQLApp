package com.dhyasani.librarygraphqlapp.dto;

import lombok.Data;

@Data
public class BookInput {
    private String isbn;
    private String  name;
    private String author;

}
