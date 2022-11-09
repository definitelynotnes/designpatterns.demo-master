package com.bootcamp.patterns.builder;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee.CoffeeBuilder().withSugar(2).withoutCreamer().makeItHot().build();
        System.out.println("Has Creamer: " + coffee.hasCreamer());
        System.out.println("Has Sugar: " + coffee.hasSugar());
        System.out.println("Temp: " + (coffee.isHot() ? "Hot" : "Cold"));
        System.out.println("Number of sugar packets: " + coffee.getNumberOfSugarPackets());
    }
}
