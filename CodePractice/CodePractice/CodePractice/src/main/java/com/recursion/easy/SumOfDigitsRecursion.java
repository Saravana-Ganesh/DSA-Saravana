package com.recursion.easy;

public class SumOfDigitsRecursion {

	public static void main(String[] args) {
		System.out.println(sum(123,0));

	}
	 private static int sum(int n,int sum) {
		 if(n==0) 
			 return sum;
		 sum+=n%10;
		 return sum(n/10,sum);
	 }

}
