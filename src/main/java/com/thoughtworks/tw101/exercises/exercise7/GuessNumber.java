package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

/**
 * Created by Ella on 6/5/16.
 */
public class GuessNumber {

    public GuessNumber(){

        Scanner in = new Scanner(System.in);
        Boolean continueGame = true;

        while( continueGame ){
            System.out.println("Welcome to the Guess Number Game! " +
                    "\nEnter in a number from 1 to 100 and we'll tell you if your too high or low.");
            playGame(in);
            continueGame = playAgain(in);
        }
        System.out.println("Thank you for playing!");
        in.close();
    }

    private void playGame(Scanner in){

        RandomNumber answer = new RandomNumber();
        int guess;

        do{
            guess = in.nextInt();
        }while(!answer.verifyGuess(guess));
    }

    private boolean playAgain(Scanner in){

        System.out.println("Would you like to play again? yes / no");
        String response = in.next();

        if(response.equals("yes")){
            return true;
        }else if(response.equals("no")){
            return false;
        }else{
            System.out.println(response + " is not a command.");
            return playAgain(in);
        }
    }


}
