package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ella on 6/6/16.
 */
public class RandomNumber {

    private int answer;
    private ArrayList<Integer> guessList;

    public RandomNumber(){
        Random randomGenerator = new Random();
        answer = randomGenerator.nextInt(100) + 1;
        guessList = new ArrayList<Integer>();
    }

    public boolean verifyGuess(int guess){

        if(guess == answer){
            System.out.println("Congratulations! You win!");
            printList();
            return true;
        }else if( guess > 100 || guess < 1){
            System.out.println("Please enter a number between 1 and 100");
            return false;
        }else if (guess < answer){
            System.out.println("Too low");
        }else{
            System.out.println("Too high");
        }
        guessList.add(guess);
        return false;
    }

    private void printList(){
        for(Integer number : guessList){
            System.out.print(number + " ");
        }
        System.out.println(answer);

    }

}
