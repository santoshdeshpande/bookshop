package com.santoshs.bookshop.store;

import com.santoshs.bookshop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for storing an order.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
