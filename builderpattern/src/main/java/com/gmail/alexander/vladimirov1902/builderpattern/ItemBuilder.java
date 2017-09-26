package com.gmail.alexander.vladimirov1902.builderpattern;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Applied Builder pattern to Items.
 */
public class ItemBuilder {
    public String productName = "No name";
    public String measurementUnit = "kg";
    public Double quantity = 0.0;
    public Double price = 0.0;

    public ItemBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ItemBuilder setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
        return this;
    }

    public ItemBuilder setQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Build object from OderItem.
     * @return new OrderItem object.
     */
    public OrderItem build() {
        return new OrderItem(this);
    }
}