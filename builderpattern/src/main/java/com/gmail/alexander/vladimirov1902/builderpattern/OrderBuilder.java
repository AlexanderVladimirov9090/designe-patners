package com.gmail.alexander.vladimirov1902.builderpattern;

import java.util.Date;
import java.util.List;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         This is the builder patternt of the Order classs.
 */
class OrderBuilder {
    public Long orderId = 0L;
    public String customerName = "No name";
    public String customerAddress = "No address";
    public Date oderCreationDate = new Date(1000);
    public Date orderDeliveryDate = new Date(1000);
    public List<OrderItem> items = null;

    public OrderBuilder setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public OrderBuilder setOderCreationDate(Date oderCreationDate) {
        this.oderCreationDate = oderCreationDate;
        return this;
    }

    public OrderBuilder setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
        return this;
    }

    public OrderBuilder setItems(List<OrderItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Build object from Order class.
     *
     * @return new Order object.
     */
    public Order build() {
        return new Order(this);
    }
}
