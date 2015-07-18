package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGenerator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RandomNumberGame {
    private UserThatStoresGuesses user;
    private final int NUMBER_TO_GUESS;

    public RandomNumberGame(){
        user = new UserThatStoresGuesses(new BufferedReader(new InputStreamReader(System.in)));
        NUMBER_TO_GUESS = RandomNumberGenerator.randomNumberBetweenTwoValues(1, 100);
    }

    public void playGame() {
        System.out.println("Welcome to the Random Number Game! Let's play!");
        while(true) {
            user.makeGuess();
            if (checkForWin()) {
                System.out.println("Congrats! You got the number I was thinking of.");
                break;
            }
            coachUser();
        }
        printGuesses();
    }

    private void printGuesses() {
        System.out.println("Before you got the answer, you guessed:");
        user.printGuesses();
    }

    private void coachUser() {
        if(user.getGuess() > NUMBER_TO_GUESS){
            System.out.println("Try guessing a little lower!");
            return;
        }
        System.out.println("Try guessing a little higher!");
    }

    private boolean checkForWin() {
        if(user.getGuess() == NUMBER_TO_GUESS){
            return true;
        }
        return false;
    }
}
