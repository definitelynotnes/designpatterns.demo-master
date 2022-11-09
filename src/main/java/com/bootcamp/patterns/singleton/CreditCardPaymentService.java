package com.bootcamp.patterns.singleton;

public class CreditCardPaymentService implements PaymentService {

    private static CreditCardPaymentService INSTANCE;

    public static CreditCardPaymentService instance() {
        if (INSTANCE == null) {
            INSTANCE = new CreditCardPaymentService();
        }
        return INSTANCE;
    }

    private CreditCardPaymentService() {
    }

    @Override
    public void process() {
        System.out.println("credit card process()");
    }

    @Override
    public void cancel() {
        System.out.println("credit card cancel()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("object cloning not supported");
    }
}
