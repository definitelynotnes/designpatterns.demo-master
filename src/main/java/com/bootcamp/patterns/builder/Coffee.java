package com.bootcamp.patterns.builder;

public class Coffee {
    private boolean hasSugar;
    private boolean hasCreamer;
    private boolean isHot;
    private int numberOfSugarPackets;

    private Coffee() {
    }

    private Coffee(boolean hasSugar, boolean hasCreamer, boolean isHot, int numberOfSugarPackets) {
        this.hasSugar = hasSugar;
        this.hasCreamer = hasCreamer;
        this.isHot = isHot;
        this.numberOfSugarPackets = numberOfSugarPackets;
    }

    public boolean hasSugar() {
        return hasSugar;
    }

    public boolean hasCreamer() {
        return hasCreamer;
    }

    public boolean isHot() {
        return isHot;
    }
    
    public int getNumberOfSugarPackets() {
        return numberOfSugarPackets;
    }

    public static class CoffeeBuilder {
        boolean hasSugar;
        boolean hasCreamer;
        boolean isHot;
        int numberOfSugarPackets;

        public CoffeeBuilder withSugar(int numberOfSugarPackets) {
            hasSugar = true;
            this.numberOfSugarPackets = numberOfSugarPackets;
            return this;
        }

        public CoffeeBuilder withoutSugar() {
            hasSugar = false;
            return this;
        }

        public CoffeeBuilder withCreamer() {
            hasCreamer = true;
            return this;
        }

        public CoffeeBuilder withoutCreamer() {
            hasCreamer = false;
            return this;
        }

        public CoffeeBuilder makeItHot() {
            isHot = true;
            return this;
        }

        public CoffeeBuilder makeItCold() {
            isHot = false;
            return this;
        }

        public Coffee build() {
            Coffee coffee = new Coffee(hasSugar, hasCreamer, isHot, numberOfSugarPackets);
            return coffee;
        }
    }

}
