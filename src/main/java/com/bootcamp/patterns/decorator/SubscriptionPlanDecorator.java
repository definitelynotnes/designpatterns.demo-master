package com.bootcamp.patterns.decorator;

public abstract class SubscriptionPlanDecorator implements SubscriptionPlan{
    private SubscriptionPlan decoratedSubscriptionPlan;
    
    public SubscriptionPlanDecorator(SubscriptionPlan decoratedSubscriptionPlan) {
        this.decoratedSubscriptionPlan = decoratedSubscriptionPlan;
    }
    
    @Override
    public void activate() {
        this.decoratedSubscriptionPlan.activate();
    }
}
