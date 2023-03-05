package com.company;

public class Strings {
    // writing code like that is not efficient and was only used for educational purpose.
    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("My string is equal to " + myString);

        // Also treated as textural representations.
        String numberString ="2.500.0";
        numberString = numberString + "99.950";
        System.out.println(numberString);

        // Even here it is a concatenation as well.
        String lastString = "10";
        // Converts the value "int" to a "string" value.
        // You can not change a string after it is created (Immutability).
        // string is more like a class.
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);



    }
}
