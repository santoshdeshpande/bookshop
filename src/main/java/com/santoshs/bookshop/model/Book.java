package com.santoshs.bookshop.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Book {
    private Long id;
    private String title;
    private String author;
    private double rating;

    private double price;

    private LocalDate publishedDate;

    private String isbn;

    private int quantity;


    public boolean inStock() {
        return quantity > 0;
    }

    public void addToStock(int quantity) {
        this.quantity = this.quantity + quantity;
    }
}
