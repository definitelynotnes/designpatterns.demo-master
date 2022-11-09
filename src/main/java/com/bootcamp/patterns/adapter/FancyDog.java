package com.bootcamp.patterns.adapter;

public class FancyDog implements NewTrick{

    @Override
    public void doTrick() {
        System.out.println("Do grocery!");
    }
    
}
