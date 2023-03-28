package org.example.product;

import lombok.Data;

@Data
public class Book extends Product {
    protected String author;

    public Book(int id, String name, int cost, String author) {
        super(id, name, cost);
        this.author = author;
    }
}



