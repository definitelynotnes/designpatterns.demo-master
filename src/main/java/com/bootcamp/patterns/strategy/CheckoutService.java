package com.bootcamp.patterns.strategy;

import com.bootcamp.patterns.strategy.beans.ShoppingCart;
import com.bootcamp.patterns.strategy.interfaces.PaymentMethod;

public class CheckoutService {
    public void checkout(ShoppingCart shoppingCart, PaymentMethod paymentMethod) {
        float amount = shoppingCart.getTotalAmount();
        paymentMethod.processPayment(amount);
    }
}
