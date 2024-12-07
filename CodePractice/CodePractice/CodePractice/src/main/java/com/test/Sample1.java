package com.test;

/**
 * Hello world!
 */
public class Sample1 {
    public static void main(String[] args) {
        printNumber(10);
    }
    private static void printNumber(int n) {
    	if(n==0)
    		return;
    	System.out.print(n+" ");
    	printNumber(n-1);
    	System.out.print(n+" ");
    }
}
