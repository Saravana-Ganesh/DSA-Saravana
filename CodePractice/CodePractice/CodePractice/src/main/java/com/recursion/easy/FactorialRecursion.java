package com.recursion.easy;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(factTailRecursion(5, 1));
	}
	private static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	private static int factTailRecursion(int n,int k) {
		if(n==1) {
			return 1*k;
		}
		return factTailRecursion(n-1,k*n);
	}
	
	
}
