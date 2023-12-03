package com.santoshs.bookshop.model;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;


/**
 * Order entity representing an order from a customer.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Order {

    private Long id;

    @Builder.Default
    private LocalDate orderDate = LocalDate.now();

    @Builder.Default
    private OrderStatus status = OrderStatus.NEW;

    @Singular
    private List<OrderLine> orderLines;


    public final double getTotal() {
        return orderLines.stream().mapToDouble(OrderLine::getSubTotal).sum();
    }

    public Order setShipped() {
        this.status = OrderStatus.SHIPPED;
        return this;
    }

    public Order setProcessing() {
        this.status = OrderStatus.PROCESSING;
        return this;
    }

    public Order setDelivered() {
        setStatus(OrderStatus.DELIVERED);
        return this;
    }
}
