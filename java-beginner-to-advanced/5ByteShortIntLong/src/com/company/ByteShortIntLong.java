// Error:
// Java: release version 10 not supported.
// Solution:
// 1) File -> Settings-> Build, Execution, Development -> Compiler -> Java Compiler
// 2) Update Project bytecode version to 8
// source: https://stackoverflow.com/questions/52788743/intellij-error-java-release-version-10-not-supported/54963753#54963753

package com.company;

public class ByteShortIntLong {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Bused MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647; // Error:(16, 28) java: integer number too large.

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // This number is still treated as an integer, unless "L" is putted at the end of the number.
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // With an "8" at the end the number is to big in size.
        short bigShortLiteralValue = 32767;

        //Some more basic arithmetic


        int myTotal = (myMinIntValue / 2);
        // Now it is treated as a byte instead of an integer. Integer is used automatically by Java.
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        // Now it is treated as a short instead of an integer.
        short myNewShortValue = (short) (myMinShortValue / 2);



    }
}
