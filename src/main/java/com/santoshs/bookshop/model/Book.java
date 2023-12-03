package com.santoshs.bookshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
