package com.santoshs.bookshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * OrderLine entity representing a line for an Order.
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Book book;

    private int quantity;

    private double price;


    public double getSubTotal() {
        return quantity * price;
    }
}
