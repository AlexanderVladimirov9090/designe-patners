package com.gmail.alexander.vladimirov1902.builderpattern;

import java.util.Date;
import java.util.List;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Class that is used to represent order from store.
 */
public final class Order {
    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date orderCreationDate;
    private Date orderDeliveryDate;
    private List<OrderItem> items;

    Order(OrderBuilder orderBuilder) {
        this.orderId = orderBuilder.orderId;
        this.customerName = orderBuilder.customerName;
        this.customerAddress = orderBuilder.customerAddress;
        this.orderCreationDate = orderBuilder.oderCreationDate;
        this.orderDeliveryDate = orderBuilder.orderDeliveryDate;
        this.items = orderBuilder.items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public Date getOrderCreationDate() {
        return orderCreationDate;
    }

    public Date getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}