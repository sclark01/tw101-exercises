package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RandomNumberGameWithUserThatStores extends com.thoughtworks.tw101.exercises.exercise7.RandomNumberGame{
    public RandomNumberGameWithUserThatStores(){
        super();
        user = new UserThatStoresGuesses(new BufferedReader((new InputStreamReader(System.in))));
    }
    @Override
    public void playGame(){
        try {
            super.playGame();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
        printGuesses();

    }

    private void printGuesses() {
        System.out.println("Before you got the answer, you guessed:");
        ((UserThatStoresGuesses)user).printGuesses();
    }
}