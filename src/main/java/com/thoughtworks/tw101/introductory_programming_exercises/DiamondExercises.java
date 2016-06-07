package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        int blankSpaces = n-1;
        int numberOfAsterisks = 1;

        for(int i = n; i > 0; i--){
            for( int j = blankSpaces; j > 0; j--){
                System.out.print(" ");
            }
            for( int j = numberOfAsterisks; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
            blankSpaces-=1;
            numberOfAsterisks+=2;
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int blankSpaces = n;
        int numberOfAsterisks = -1;

        for(int i = n; i > 0; i--){
            blankSpaces-=1;
            numberOfAsterisks+=2;

            for( int j = blankSpaces; j > 0; j--){
                System.out.print(" ");
            }
            for( int j = numberOfAsterisks; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++){
            blankSpaces+=1;
            numberOfAsterisks-=2;
            for( int j = 0; j < blankSpaces; j++){
                System.out.print(" ");
            }
            for( int j = 0; j < numberOfAsterisks; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawADiamondWithYourName(n, 1, 1);
    }

    private static void drawADiamondWithYourName(int n, int depth, int numberOfAsterisks) {
        if(depth % n == 0){
            System.out.print("Ella");
        }else{
            int blankSpaces = n - depth;
            for( int i = 0; i < blankSpaces; i++){
                System.out.print(" ");
            }
            for( int i = 0; i < numberOfAsterisks; i++){
                System.out.print("*");
            }

            System.out.println();
            drawADiamondWithYourName(n, depth +1, numberOfAsterisks+2);
            System.out.println();

            for( int i = 0; i < blankSpaces; i++){
                System.out.print(" ");
            }
            for( int i = 0; i < numberOfAsterisks; i++){
                System.out.print("*");
            }

        }
    }
}
