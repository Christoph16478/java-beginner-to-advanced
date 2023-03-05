package com.company;

public class OperatorChallange {
	// List of Java Keywords : https://en.wikipedia.org/wiki/List_of_Java_keywords
    public static void main(String[] args) {

	    double myFirstValue = 20.00d;
	    double mySecondValue = 80.00d;
	    double myValuesTotal = myFirstValue + mySecondValue * 100.00d;

	    System.out.println("MyValuesTotal = " + myValuesTotal);
	    double theRemainder = myValuesTotal % 40.00d;

	    System.out.println("theRemainder = " + theRemainder);
	    boolean isNoRemainder = (theRemainder == 0) ? true : false;

	    System.out.println("isNorRemainder = " + isNoRemainder);

	    if (!isNoRemainder) {
	        System.out.println("Got some remainder");
        }
    }
}
