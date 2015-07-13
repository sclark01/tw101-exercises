package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

public class RandomNumberGenerator {
    public static int randomNumberBetweenTwoValues(int min, int max){
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }
}
