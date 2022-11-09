package com.bootcamp.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<String> toppings;
    private boolean cheese;
    private boolean thickCrust;
    private int inches;
    private String sauce;

    public Pizza() {
    }

    public Pizza(List<String> toppings, boolean cheese, boolean thickCrust, int inches, String sauce) {
        this.toppings = toppings;
        this.cheese = cheese;
        this.thickCrust = thickCrust;
        this.inches = inches;
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean isThickCrust() {
        return thickCrust;
    }

    public int getInches() {
        return inches;
    }

    public String getSauce() {
        return sauce;
    }

    public static Builder builder() {
        return new Pizza.Builder();
    }

    public static class Builder {
        private List<String> toppings;
        private boolean cheese;
        private boolean thickCrust;
        private int inches;
        private String sauce;

        public Builder() {
            toppings = new ArrayList<>();
        }

        public Builder addToppings(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Builder withCheese() {
            this.cheese = true;
            return this;
        }

        public Builder withoutCheese() {
            this.cheese = false;
            return this;
        }

        public Builder makeThinCrust() {
            this.thickCrust = false;
            return this;
        }

        public Builder makeThickCrust() {
            this.thickCrust = true;
            return this;
        }

        public Builder numberOfInches(int inches) {
            this.inches = inches;
            return this;
        }

        public Builder addSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza(toppings, cheese, thickCrust, inches, sauce);
            return pizza;

        }
    }
}
