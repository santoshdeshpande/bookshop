package com.santoshs.bookshop.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void quantityIsUpdatedProperly() {
        Book book = new Book();
        book.setQuantity(10);
        book.addToStock(100);
        assertEquals(110, book.getQuantity());
    }

    @Test
    public void returnsFalseWhenBookIsNotInStock() {
        Book book = new Book();
        book.setQuantity(0);
        assertFalse(book.inStock());
    }
}
