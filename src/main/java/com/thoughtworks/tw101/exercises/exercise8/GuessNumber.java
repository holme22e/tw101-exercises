package com.thoughtworks.tw101.exercises.exercise8;
import java.util.Scanner;

/**
 * Created by Ella on 6/6/16.
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
        int guess = 0;

        do{
           while(!in.hasNextInt()){
               System.out.println("Please enter a number between 1 and 100");
               in.next();
           }
            guess = in.nextInt();
        }while(!answer.verifyGuess(guess));
    }

    private boolean playAgain(Scanner in){
        System.out.println("Would you like to play again? yes / no");
        String response = in.next();

        while( !response.equals("yes") && !response.equals("no")){
            System.out.println("Please enter yes or no");
            response = in.next();
        }

        return (response.equals("yes")) ? true : false;
    }


}
