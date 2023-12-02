package org.example;

import java.util.Random;

public class Character {
    private State currentState;

    public Character() {
        this.currentState = new NormalState();
        System.out.println("Character created in Normal state.");
    }
    public void setState(State state) {
        this.currentState = state;
    }

    public void attack() {
        this.currentState.attack();
    }

    public void move() {
        this.currentState.move();
    }
    public void healCharacter() {
        if (currentState instanceof NormalState) {
            System.out.println("Character healed.");
        } else {
            System.out.println("Healing can only be done in Normal state.");
        }
}
    public void enrageCharacter() {
        System.out.println("Character enraged.");
        this.currentState = new EnragedState();
    }

    public void poisonCharacter() {
        System.out.println("Character poisoned.");
        this.currentState = new PoisonedState();
    }

    public void attackCharacter(Character target) {
        Random random = new Random();
        int randomValue = random.nextInt(100);

        if (randomValue < 30) {
            this.currentState = new EnragedState();
            System.out.println("Attacker became Enraged.");
        } else if (randomValue < 60) {
            target.setState(new EnragedState());
            System.out.println("Target became Enraged.");
        } else {
            System.out.println("Attack successful without state change.");
        }
    }
}
