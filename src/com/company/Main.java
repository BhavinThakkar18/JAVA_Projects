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
    }
}
