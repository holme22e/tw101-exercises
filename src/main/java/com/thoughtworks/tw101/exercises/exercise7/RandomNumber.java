package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by Ella on 6/5/16.
 */
public class RandomNumber {

    private int random;

    public RandomNumber(){
        Random randomGenerator = new Random();
        random = randomGenerator.nextInt(100) + 1;
    }

    public boolean verifyGuess(int guess){
        if(guess == random){
            System.out.println("Congratulations! You win!");
            return true;
        }else if (guess < random){
            System.out.println("Too low");
        }else{
            System.out.println("Too high");
        }
        return false;
    }

}
