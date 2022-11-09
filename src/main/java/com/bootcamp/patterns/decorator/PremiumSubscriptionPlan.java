package com.bootcamp.patterns.decorator;

public class PremiumSubscriptionPlan implements SubscriptionPlan{

    @Override
    public void activate() {
        System.out.println("Premium subscription plan activated");
    }

}
