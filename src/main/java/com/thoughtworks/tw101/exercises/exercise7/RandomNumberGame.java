package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RandomNumberGame {
    protected User user;
    protected final int NUMBER_TO_GUESS;

    public RandomNumberGame(){
        user = new User(new BufferedReader(new InputStreamReader(System.in)));
        NUMBER_TO_GUESS = RandomNumberGenerator.randomNumberBetweenTwoValues(1, 100);
    }

    public RandomNumberGame(User user){
        this.user = user;
        NUMBER_TO_GUESS = RandomNumberGenerator.randomNumberBetweenTwoValues(1, 100);
    }

    public void playGame() throws Exception {
        System.out.println("Welcome to the Random Number Game! Let's play!");
        while(true) {
            user.makeGuess();
            if (checkForWin()) {
                System.out.println("Congrats! You got the number I was thinking of.");
                break;
            }
            coachUser();
        }
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
