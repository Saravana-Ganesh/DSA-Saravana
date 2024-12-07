package com.recursion.easy;

public class SumOfFirstNNaturalNumbers {
	public static void main(String[] args) {
		System.out.println(getSumUsingMath(10000));
		System.out.println(getSumIterativeApproach(10000));
		System.out.println(getSumRecursiveApproach(10000));
		System.out.println(getSumTailRecursiveApproach(0, 10000));
		
	}
	private static int getSumRecursiveApproach(int n) {
		if(n==0) {
			return 0;
		}
		return n+getSumRecursiveApproach(n-1);
	}
	
	private static int getSumTailRecursiveApproach(int sum, int count) {
		if(count==0) {
			return sum;
		}
		return getSumTailRecursiveApproach(sum+count,--count);
	}
	
	private static int getSumIterativeApproach(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	private static int getSumUsingMath(int n) {
		return n*(n+1)/2;
	}
}
