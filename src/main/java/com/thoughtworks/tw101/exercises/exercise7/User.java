package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class User {
    private int currentGuess;
    private Scanner scanner;

    public User(){
        scanner = new Scanner(System.in);
    }

    public void makeGuess(){
        System.out.print("Enter your guess: ");
        currentGuess = scanner.nextInt();
    }

    public int getGuess() {
        return currentGuess;
    }
}
