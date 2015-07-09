package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int totalCalls = 0;

    public void increment() {
        totalCalls++;
    }

    public void total() {
        System.out.println(totalCalls);
    }
}
