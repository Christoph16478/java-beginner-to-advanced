package com.company;

public class StatementsWithSpaceAndIndenting {

    public static void main(String[] args) {
        // This are all statements
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        // Code is also breakable. Java does not care about that.
        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one"); // Not recommended put statements on the same line.

        // Java does not care about the whitespaces made by the programmer.
    }
}

// Here the concept of Indentation.
// This version is harder to read than the above one.
// IntelliJ IDEA -> Code -> Reformat Code.
// package com.company;

// public class Main {
//
// public static void main(String[] args) {
//      // This are all statements
//      int myVariable = 50;
//      myVariable++;
//      myVariable--;
//      System.out.println("This is a test");
//
//      // Code is also breakable. Java does not care about that.
//      System.out.println("This is" +
//      " another" +
    //      " still more.");
//
//      int anotherVariable = 50;
//      myVariable--;
//      System.out.println("This is another one"); // Not recommended put statements on the same line.
//  }
// }