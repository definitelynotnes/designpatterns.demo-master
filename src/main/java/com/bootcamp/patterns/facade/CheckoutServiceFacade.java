package com.bootcamp.patterns.facade;

public class CheckoutServiceFacade {
    private OrderService orderService;
    private PaymentService paymentService;
    private VoucherService voucherService;
    private ShippingService shippingService;
    public CheckoutServiceFacade(OrderService orderService,
                                 PaymentService paymentService,
                                 VoucherService voucherService,
                                 ShippingService shippingService) {
        this.orderService = orderService;
        this.paymentService = paymentService;
        this.voucherService = voucherService;
        this.shippingService = shippingService;
    }
    
    public void checkout() {
        orderService.calculate();
        paymentService.processPayment();
        shippingService.createShippingLabels();
    }
    
    public void checkoutWithVoucher() {
        orderService.calculate();
        paymentService.processPayment();
        voucherService.applyDiscount();
        shippingService.createShippingLabels();
    }
    
}
