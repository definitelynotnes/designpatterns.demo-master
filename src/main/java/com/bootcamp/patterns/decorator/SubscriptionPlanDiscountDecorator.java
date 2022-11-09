package com.bootcamp.patterns.decorator;

class SubscriptionPlanUnlimitedDataDecorator extends SubscriptionPlanDecorator{
    public SubscriptionPlanUnlimitedDataDecorator(SubscriptionPlan decoratedSubscriptionPlan) {
        super(decoratedSubscriptionPlan);
    }
    
    @Override
    public void activate() {
        super.activate();
        System.out.println("Data Limit: Unlimited");
    }
}

public class SubscriptionPlanDiscountDecorator extends SubscriptionPlanDecorator{

    private int discountPercentage;
    public SubscriptionPlanDiscountDecorator(SubscriptionPlan decoratedSubscriptionPlan) {
        super(decoratedSubscriptionPlan);
    }

    @Override
    public void activate() {
        setDiscountPercentage(10);
        super.activate();
        System.out.println("Discount rate: " + this.discountPercentage);
    }
    
    private void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    
    public static void main(String[] args) {
        SubscriptionPlan postpaidStandardSubscriptionPlan = new StandardSubscriptionPlan();
        SubscriptionPlan tenPercentDecorator = new SubscriptionPlanDiscountDecorator(postpaidStandardSubscriptionPlan);
        SubscriptionPlan tenPercentDecorator2 = new SubscriptionPlanDiscountDecorator(tenPercentDecorator);
        SubscriptionPlan unlimitedDataDecorator = new SubscriptionPlanUnlimitedDataDecorator(tenPercentDecorator2);
        unlimitedDataDecorator.activate();
    }
}
