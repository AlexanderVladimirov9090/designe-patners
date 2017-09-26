package com.gmail.alexander.vladimirov1902.observerpattern;

import java.util.List;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         This is the class Store.
 */
class Store {
    private final List<ProductChangeListener> productChangeListeners;

    public Store(List<ProductChangeListener> productChangeListeners) {
        this.productChangeListeners = productChangeListeners;
    }

    /**
     * Assign`s change listener that is going to apply changes to the stock.
     *
     * @param productChangeListener that is going to apply changes.
     */
    public void assignChangeListener(ProductChangeListener productChangeListener) {
        productChangeListeners.add(productChangeListener);
    }

    /**
     * Gives the product and amount to the observer class when adding the product to store`s inventory.
     *
     * @param product that is going to be added.
     * @param amount  of the product.
     */
    public void addProduct(Product product, int amount) {
        productChangeListeners.forEach(productChangeListener -> productChangeListener.onProductAdd(product, amount));

    }

    /**
     * Gives the product to the observer class when selling product from the inventory.
     *
     * @param product that is going to be sold.
     * @param amount  of the product
     */
    public void sellProduct(Product product, int amount) {
        productChangeListeners.forEach(productChangeListener -> productChangeListener.onProductSell(product, amount));
    }
}