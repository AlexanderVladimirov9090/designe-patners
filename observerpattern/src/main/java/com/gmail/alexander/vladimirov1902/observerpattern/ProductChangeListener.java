package com.gmail.alexander.vladimirov1902.observerpattern;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         This inteface is used as an observer to set changes to the product`s amount.
 */
public interface ProductChangeListener {

    /**
     * Adds product or amount in to store`s stock.
     *
     * @param product that is going to be added.
     * @param amount  of the product.
     */
    void onProductAdd(Product product, int amount);

    /**
     * Sells given amount ot the product.
     *
     * @param product that is going to be added.
     * @param amount  of the product.
     */
    void onProductSell(Product product, int amount);
}