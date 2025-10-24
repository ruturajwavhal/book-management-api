package com.ruturaj.book_management_api.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BookEntry {

    private long id;
    private String title;
    private String author;
    private double price;

}
