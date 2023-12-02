package org.example;

public class PoisonedState implements State {
    @Override
    public void attack() {
        System.out.println("Poisoned Attack");
    }

    @Override
    public void move() {
        System.out.println("Poisoned Move");
    }
}