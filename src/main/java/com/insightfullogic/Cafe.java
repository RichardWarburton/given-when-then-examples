package com.insightfullogic;

public class Cafe {

    private int coffeesRemaining;

    public Cafe() {
        coffeesRemaining = 0;
    }

    public void setCoffeesRemaining(int coffeesRemaining) {
        this.coffeesRemaining = coffeesRemaining;
    }

    public void serveCoffee() {
        coffeesRemaining--;
    }

    public boolean canServeCoffee() {
        return coffeesRemaining > 0;
    }
}
