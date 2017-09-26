package com.gmail.alexander.vladimirov1902.observerpattern;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Amout of product in stock.
 */
public class Amount {
    private final int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    /**
     * Shows value of the product.
     *
     * @return the amount.
     */
    public int value() {
        return amount;
    }
}