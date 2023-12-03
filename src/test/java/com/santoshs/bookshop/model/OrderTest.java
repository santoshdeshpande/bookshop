package com.santoshs.bookshop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrderTest {

    @Test
    public void ensureOrderIsProperlyInitialized() {
        Order order = Order.builder().build();
        assertEquals(0.0, order.getTotal());
        assertEquals(OrderStatus.NEW, order.getStatus());
        assertNotNull(order.getOrderDate());
    }
}
