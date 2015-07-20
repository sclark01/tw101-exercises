package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
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
            printSpaces(numberOfSpaces - i);
            printAsterisks(numberOfAsterisks);
            numberOfAsterisks += 2;
            System.out.println("");
        }
    }

    private static void drawInvertedIsoscelesTriangle(int n, int startTriangleXSpacesToTheRight) {
        if(n < 1) return;
        int numberOfAsterisks = n + (n - 1);
        int numberOfSpaces = n + startTriangleXSpacesToTheRight;

        for (int i = n; i > 0; i--) {
            printSpaces(numberOfSpaces - i);
            printAsterisks(numberOfAsterisks);
            numberOfAsterisks -= 2;
            System.out.println("");
        }
    }

    private static void printAsterisks(int numberToPrint) {
        for (int i = 0; i < numberToPrint; i++) {
            System.out.print("*");
        }
    }

    private static void printSpaces(int numberToPrint) {
        for (int i = 0; i < numberToPrint; i++) {
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
        drawInvertedIsoscelesTriangle(n - 1, 1);
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
        drawAnIsoscelesTriangle(n - 1);
        System.out.println("Shea");
        drawInvertedIsoscelesTriangle(n - 1, 0);
    }
}
