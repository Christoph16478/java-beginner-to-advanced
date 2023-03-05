package com.company;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value =" + myMinFloatValue);
        System.out.println("Float maximum value =" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value =" + myMinDoubleValue);
        System.out.println("Double maximum value =" + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        //without the "f" a double will be found. Or "(float") can be used as well.
        // It is more common to use the "double"
        float myFloatValueZero = 5f / 3f;
        float myFloatValueOne = (float) 5.28;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue" + myIntValue);
        System.out.println("MyFloatValue" + myFloatValueZero);
        System.out.println("MyFloatValue" + myFloatValueOne);
        System.out.println("MyDoubleValue" + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_47_890d;
        System.out.println(convertedKilograms);
    }
}
