package org.example;

public class NormalState implements State {
    @Override
    public void attack() {
        System.out.println("Normal Attack");
    }

    @Override
    public void move() {
        System.out.println("Normal Move.");
    }
}
