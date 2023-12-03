package com.santoshs.bookshop.model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;


/**
 * Tests for Orders.
 */
public class OrderTest {

    @Test
    public void ensureOrderIsProperlyInitialized() {
        Order order = Order.builder().build();
        assertEquals(0.0, order.getTotal());
        assertEquals(OrderStatus.NEW, order.getStatus());
        assertNotNull(order.getOrderDate());
    }
}
