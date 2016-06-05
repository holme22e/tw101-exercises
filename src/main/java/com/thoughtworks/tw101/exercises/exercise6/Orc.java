package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Ella on 6/5/16.
 */
public class Orc implements Monster {

    private int hitPoints = 20;
    private String name = "Orc";

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " has " + hitPoints + " points left!");
    }
}

