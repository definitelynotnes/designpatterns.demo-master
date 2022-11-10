package com.bootcamp.patterns.strategy;

import com.bootcamp.patterns.strategy.interfaces.PaymentMethod;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PaypalPaymentMethod implements PaymentMethod{
    private String email;
    private String password;
    @Override
    public void processPayment(float amount) {
        System.out.println(String.format("%s paid with paypal.", amount));
    }
}
