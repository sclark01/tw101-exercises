package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserThatStoresGuesses extends com.thoughtworks.tw101.exercises.exercise7.User{
    private ArrayList<Integer> guesses;

    public UserThatStoresGuesses(){
        super();
        guesses = new ArrayList<>();
    }

    public UserThatStoresGuesses(BufferedReader bufferedReader){
        super(bufferedReader);
        guesses = new ArrayList<>();
    }

    @Override
    public void makeGuess() {
        while(true) {
            System.out.print("Enter your guess: ");
            String in;
            try {
                in = input.readLine();
                try {
                    currentGuess = Integer.parseInt(in);
                    guesses.add(currentGuess);
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Make sure you're entering a number");
                }
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
    }
    public void printGuesses() {
        for(Integer guess : guesses){
            System.out.print(guess + " ");
        }
    }
}
