package com.bootcamp.patterns.adapter;

public class NewDog implements NewTrick{

    @Override
    public void doTrick() {
        System.out.println("Sing!");       
    }

}
