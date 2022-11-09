package com.bootcamp.patterns.decorator;

public class StandardSubscriptionPlan implements SubscriptionPlan{

    @Override
    public void activate() {
        System.out.println("Standard subscription plan activated");
    }

}
