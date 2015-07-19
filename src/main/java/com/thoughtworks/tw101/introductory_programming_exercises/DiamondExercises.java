package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawInversedIsoscelesTriangle(3);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        if(n < 1) return;
        int level = 1;
        int spaces = n - 1;

        for (int i = 0; i < n; i++) {
            addSpaces(spaces - i);
            printAsterisks(level);
            level += 2;
            System.out.println("");
        }
    }

    private static void drawInversedIsoscelesTriangle(int n) {
        if(n < 1) return;
        int level = n + 2;
        int spaces = n;

        for (int i = n; i > 0; i--) {
            addSpaces(spaces - i);
            printAsterisks(level);
            level -= 2;
            System.out.println("");
        }
    }

    private static void printAsterisks(int level) {
        for (int j = 0; j < level; j++) {
            System.out.print("*");
        }
    }

    private static void addSpaces(int spaces) {
        for (int k = spaces; k > 0; k--) {
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
        drawInversedIsoscelesTriangle(n);
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
