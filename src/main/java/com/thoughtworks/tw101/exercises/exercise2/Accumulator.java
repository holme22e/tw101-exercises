package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    public static int incrementCounter = 0;

    public void increment(){
        incrementCounter++;
    }

    public void total(){
        System.out.println(incrementCounter);
    }
}
