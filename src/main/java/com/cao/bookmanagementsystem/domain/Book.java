package com.cao.bookmanagementsystem.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    String isbn;
    String name;
    String author;
    String publishDate;
}
