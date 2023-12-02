package org.example;


public class Main {
    public static void main(String[] args) {

//        Character character = new Character();
//
//        character.setState(new EnragedState());
//        System.out.println("Character is now Enraged.");
//        character.attack();
//        character.move();
//
//        character.setState(new PoisonedState());
//        System.out.println("Character is now Poisoned.");
//        character.attack();
//        character.move();

        Character character1 = new Character();
        Character character2 = new Character();

        character1.attackCharacter(character2);

        character1.enrageCharacter();
        character1.healCharacter();

        character2.poisonCharacter();
        character2.attackCharacter(character1);    }
}