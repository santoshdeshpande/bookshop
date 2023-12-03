package com.santoshs.bookshop.model;

import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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


    public double getTotal() {
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
