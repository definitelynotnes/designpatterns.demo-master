package com.bootcamp.patterns.builder;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                           .addSauce("tomato")
                           .addToppings("pepperoni")
                           .addToppings("pineapple")
                           .addToppings("bacon")
                           .addToppings("mushroom")
                           .makeThinCrust()
                           .numberOfInches(12)
                           .withCheese()
                           .build();

        for (String topping : pizza.getToppings()) {
            System.out.println("Topping: " + topping);
        }
    }
}
