package com.gmail.alexander.vladimirov1902.observerpattern;

import java.util.List;
import java.util.Map;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Concreate implementations of ProductChangeListener.
 */

public class StockVendor implements ProductChangeListener {
    private final Map<Product, Amount> inStock;
    private final List<Product> outOfStock;
    private final Display display;

    public StockVendor(Map<Product, Amount> inStock, List<Product> outOfStock, Display display) {
        this.inStock = inStock;
        this.outOfStock = outOfStock;
        this.display = display;
    }

    /**
     * Adds product to store`s stock or adds to already there stock the new amount.
     *
     * @param product that is going to be add to the store or changes its amount.
     * @param amount  of the product.
     */
    public void onProductAdd(Product product, int amount) {
        if (inStock.containsKey(product)) {
            int updatedAmount = inStock.get(product).value() + amount;
            inStock.replace(product, new Amount(updatedAmount));
        } else {
            inStock.put(product, new Amount(amount));
        }
        display.show(product, inStock.get(product).value());
    }

    /**
     * Sells product and if it is out of stock removes it, then send it to OutOfStock.
     *
     * @param product that is going to be sold and if the amount is zero, it is going to be send to OutOfStock.
     * @param amount  of the product.
     */
    public void onProductSell(Product product, int amount) {
        int inStockAmount = inStock.get(product).value();
        if (inStockAmount >= amount) {
            inStockAmount -= amount;
            inStock.replace(product, new Amount(inStockAmount));
        } else {
            inStock.remove(product);
            outOfStock.add(product);
            inStockAmount = 0;
        }
        display.show(product, inStockAmount);
    }
}