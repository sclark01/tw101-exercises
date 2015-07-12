package com.thoughtworks.tw101.exercises.exercise7;

public class RandomNumberGame {
    private User user;
    private final int numberToGuess;

    public RandomNumberGame(){
        user = new User();
        numberToGuess = RandomNumberGenerator.randomNumberBetweenTwoValues(1, 100);
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
        if(user.getGuess() > numberToGuess){
            System.out.println("Try guessing a little lower!");
            return;
        }
        System.out.println("Try guessing a little higher!");
    }

    private boolean checkForWin() {
        if(user.getGuess() == numberToGuess){
            return true;
        }
        return false;
    }
}
