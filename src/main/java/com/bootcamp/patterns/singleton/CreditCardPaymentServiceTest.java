package com.bootcamp.patterns.singleton;

public class CreditCardPaymentServiceTest {
    public static void main(String[] args) {
        PaymentService creditCardPaymentService1 = CreditCardPaymentService.instance();
        PaymentService creditCardPaymentService2 = CreditCardPaymentService.instance();
        System.out.println(creditCardPaymentService1 == creditCardPaymentService2);
    }
}
