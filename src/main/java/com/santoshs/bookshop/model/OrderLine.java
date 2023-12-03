package com.santoshs.bookshop.model;

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
public class OrderLine {

    private Order order;

    private Book book;

    private int quantity;

    private double price;


    public double getSubTotal() {
        return quantity * price;
    }
}
