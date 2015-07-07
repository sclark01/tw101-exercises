package com.thoughtworks.tw101.exercises.exercise1;

/**
 * Created by sclark01 on 7/7/15.
 */
public class OddNumbersAndSum {
    public void ToOneHundred(){
        Integer sum = 0;
        for (int i = 1; i < 101; i++) {
            if(i % 2 != 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
