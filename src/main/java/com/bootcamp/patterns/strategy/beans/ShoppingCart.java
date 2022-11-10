package com.bootcamp.patterns.strategy.beans;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        this.items.add(item);
    }
    
    public void removeItem(Item item) {
        if(item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
    }
    
    public float getTotalAmount() {
        float totalAmount = 0F;
        for(Item item : items) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }
}
