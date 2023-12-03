package com.santoshs.bookshop.model;

import lombok.*;

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
