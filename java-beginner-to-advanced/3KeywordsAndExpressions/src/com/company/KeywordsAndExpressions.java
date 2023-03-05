package com.company;

public class KeywordsAndExpressions {

    public static void main(String[] args) {
        int intTwo = 5;
        // Others are false, true and null.

        // 1 mile is equal to 1.609344 kilometers
        double kilometres = (100 * 1.609344);

        int highScore = 50;

        // if is an control statement
        //Everything in the brackets is an expression
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // Challange:
        // In the follwing code that typed below, write down
        // What parts of the code are expressions.
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
        System.out.println("\nExpressions are:");
        System.out.println("----------------");
        System.out.println("score = 100 in the first line");
        System.out.println("score > 99 is also one");
        System.out.println("\"You got the high score!\" also that is a valid expression as well");
        System.out.println("score = 0 is an expression as well");
    }
}
