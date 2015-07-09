package com.thoughtworks.tw101.exercises.exercise5;

public class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        if(length < 0) {
            length = 0;
        }
        if(width < 0){
            width = 0;
        }
        this.length = length;
        this.width = width;
    }

    public int area(){
        return length * width;
    }
}
