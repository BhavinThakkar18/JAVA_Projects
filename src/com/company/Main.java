package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue= Integer.MAX_VALUE;
        System.out.println("MIN_INT Value: "+myMinIntValue);
        System.out.println("MAX_INT Value: "+myMaxIntValue);
        System.out.println("Busted MAX Value "+ (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted MIN Value "+ (myMinIntValue - 1)); // Underflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min_Byte Value: "+ myMinByteValue);
        System.out.println("Max_Byte Value: "+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min Short value "+ myMinShortValue);
        System.out.println("Max Short Value:" + myMaxShortValue);

        int myTotal = (myMinIntValue/2);
        byte myByteTotal = (byte) (myMinByteValue/2); //type casting
        short myShortTotal = (short) (myMinShortValue/2); //type casting

        byte  num1 = 50;
        short num2 = 150;
        int num3 = 550;
        long total = 50000L + 10L*(num1+num2+num3);
        System.out.println("Total:"+ total);

        System.out.println("Min float value: "+Float.MIN_VALUE );
        System.out.println("Max float value "+Float.MIN_VALUE);

        System.out.println("Min Double value: "+ Double.MIN_VALUE);
        System.out.println("Max Double value: "+ Double.MAX_VALUE);

        double pound = 200;
        double killoGrams = pound*(0.45359237);
        System.out.println("KG: "+killoGrams);

        char myChar = 'D';
        char myCharUnicode = '\u0044';
        System.out.println("Mychar:" +myCharUnicode);
        char myCopyRightChar = '\u00A9';
        System.out.println("MyCopyRightChar "+myCopyRightChar);

        int myInt = 50;
        String myString = "10";
        System.out.println("Output: "+myInt+myString); //Output= 5010
    }
}
