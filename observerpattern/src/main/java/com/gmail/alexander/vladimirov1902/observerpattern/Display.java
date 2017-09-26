package com.gmail.alexander.vladimirov1902.observerpattern;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Interface Display is used to deliver feedback to the user when interacting with the application.
 */
public interface Display {

    /**
     * Will display to the user The product and the amount that the store has in stock.
     *
     * @param product chosen for displaying to the user .
     * @param amount  of the chosen product.
     */
    void show(Product product, int amount);
}