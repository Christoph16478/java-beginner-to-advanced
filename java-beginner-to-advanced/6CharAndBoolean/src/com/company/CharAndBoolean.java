package com.company;

public class CharAndBoolean {

    public static void main(String[] args) {

	    //Similar to the string but it can store only one single characters.
        //https://unicode-table.com/en/
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyone = true;

    }
}
