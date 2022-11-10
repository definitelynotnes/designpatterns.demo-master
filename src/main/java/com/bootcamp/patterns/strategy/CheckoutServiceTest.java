package com.bootcamp.patterns.strategy;

import com.bootcamp.patterns.strategy.beans.Item;
import com.bootcamp.patterns.strategy.beans.ShoppingCart;

public class CheckoutServiceTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("A151", 50);
        Item item2 = new Item("E613", 15);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(shoppingCart, new PaypalPaymentMethod("customer@gmail.com", "pass123"));
        checkoutService.checkout(shoppingCart, new CreditCardPaymentMethod("John Doe", "1234123467891234", "123", "12/2022"));
    }
}
