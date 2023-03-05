package com.company;

// Summary of Operators in Java.
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html

public class Main {

    public static void main(String[] args) {

	    int result = 3; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // Remainder of (4 % 3) = 1 left over
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 =" +result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // "=" - assignment operator.
        boolean isAlien = true;
        // "==" - testing wether the particular value is false.
        // With ";" after the ..== false) the program is still working very well.
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
        } else {
            System.out.println("And I am scared of Aliens.");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        // Working on boolean operands: checks if condition is true or false.
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        // Shortcut for is "true" or not "true".
        // The ! or NOT Operator is also known as the Logical Complement Operator.
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Ternary Operator
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        boolean wasCar = isCar ? true: false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
