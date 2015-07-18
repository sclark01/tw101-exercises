package com.thoughtworks.tw101.exercises.exercise8;

public class RandomNumberGameShowGuesses extends com.thoughtworks.tw101.exercises.exercise7.RandomNumberGame{
    UserThatStoresGuesses user = new UserThatStoresGuesses();
    @Override
    public void playGame(){
        try {
            super.playGame();
        } catch (Exception e) {
            e.printStackTrace();
        }
        printGuesses();
    }
    private void printGuesses() {
        System.out.println("Before you got the answer, you guessed:");
        user.printGuesses();
    }
}
