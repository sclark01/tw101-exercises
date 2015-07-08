package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private Integer totalCalls = 0;

    public void increment() {
        totalCalls += 1;
    }

    public void total() {
        System.out.println(totalCalls);
    }
}
