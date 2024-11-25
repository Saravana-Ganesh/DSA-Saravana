package com.recursion.easy;

public class NaturalSum {
	/*
	 *  Input: N = 10
		Output: 4
		Explanation: Sum of first 4 natural
		number is 1 + 2 + 3 + 4 = 10.  
	 */
	private static int k=0;

	public static void main(String[] args) {
		System.out.println(findNaturalSumUsingIterativeCall(16));
		System.out.println(findNaturalSumUsingMath(16));

	}
	
	private static int findNaturalSumUsingMath(int a) {
		return (int)(Math.sqrt(1+(8*(a)))-1)/2;
	}
	
	private static int findNaturalSumUsingRecursiveCall(int n) {
		k=n;
		return sum(0, 0);
	}
	
	private static int findNaturalSumUsingIterativeCall(int n) {
		int sum=0;
		for(int i=1;;i++) {
			if(sum>n) {
				return -1;
			}else if(sum==n) {
				return --i;
			}
			sum+=i;
		}
	}
	private static int sum(int n,int count) {
		if(n>k) {
			return -1;
		}else if(n==k) {
			return count;
		}
	
		return sum(n,++count);
		 
	}
	

}
