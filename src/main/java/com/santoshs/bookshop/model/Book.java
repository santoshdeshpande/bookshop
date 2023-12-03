package com.santoshs.bookshop.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Book represents an entity of type Book.
 */
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


    public final boolean inStock() {
        return quantity > 0;
    }

    public final void addToStock(int qty) {
        this.quantity = this.quantity + qty;
    }
}
