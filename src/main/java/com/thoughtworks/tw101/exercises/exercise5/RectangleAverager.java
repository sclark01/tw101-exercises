package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int numRectangles = rectangles.length;
        int sum = 0;
        for (int i = 0; i < numRectangles; i++) {
            sum += rectangles[i].area();
        }
        return sum / numRectangles;
    }
}
