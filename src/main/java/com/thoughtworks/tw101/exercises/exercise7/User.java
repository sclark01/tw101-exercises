package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User {
    private int currentGuess;
    private BufferedReader input;

    public User(){
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public void makeGuess() throws Exception{
        System.out.print("Enter your guess: ");
        String in = input.readLine();
        System.out.println(in);
        currentGuess = Integer.parseInt(in);
    }

    public int getGuess() {
        return currentGuess;
    }
}
