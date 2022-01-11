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
    }
}
