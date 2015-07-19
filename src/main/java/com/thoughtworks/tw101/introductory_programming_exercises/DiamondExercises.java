package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
//        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        if(n < 1) return;
        int numberOfAsterisks = 1;
        int numberOfSpaces = n - 1;

        for (int i = 0; i < n; i++) {
            addSpaces(numberOfSpaces - i);
            printAsterisks(numberOfAsterisks);
            numberOfAsterisks += 2;
            System.out.println("");
        }
    }

    private static void drawInvertedIsoscelesTriangle(int n) {
        if(n < 1) return;
        int numberOfAsterisks = n + (n - 1);
        int numberOfSpaces = n + 1;

        for (int i = n; i > 0; i--) {
            addSpaces(numberOfSpaces - i);
            printAsterisks(numberOfAsterisks);
            numberOfAsterisks -= 2;
            System.out.println("");
        }
    }

    private static void printAsterisks(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("*");
        }
    }

    private static void addSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawInvertedIsoscelesTriangle(n - 1);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }
}
