package com.santoshs.bookshop.store;

import com.santoshs.bookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository implementation for Books.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
