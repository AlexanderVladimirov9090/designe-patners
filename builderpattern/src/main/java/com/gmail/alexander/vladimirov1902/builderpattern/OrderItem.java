package com.gmail.alexander.vladimirov1902.builderpattern;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         This is class represents odered items from the store.
 */
public final class OrderItem {
    private String productName;
    private String measurementUnit;
    private Double quantity;
    private Double price;

    OrderItem(ItemBuilder itemBuilder) {
        this.productName = itemBuilder.productName;
        this.measurementUnit = itemBuilder.measurementUnit;
        this.quantity = itemBuilder.quantity;
        this.price = itemBuilder.price;
    }

    public String getProductName() {
        return productName;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}