package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class User {
    private int currentGuess;
    private BufferedReader input;
    private ArrayList<Integer> guesses;

    public User(){
        input = new BufferedReader(new InputStreamReader(System.in));
        guesses = new ArrayList();
    }

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

    public int getGuess() {
        return currentGuess;
    }

    public void printGuesses() {
        for(Integer guess : guesses){
            System.out.print(guess + " ");
        }
    }
}
