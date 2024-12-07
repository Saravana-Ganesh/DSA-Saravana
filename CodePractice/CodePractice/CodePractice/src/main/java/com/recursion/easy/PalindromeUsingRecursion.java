package com.recursion.easy;

interface A{
	void m1();
}
interface B{
	int m1();
}

public class PalindromeUsingRecursion{

	public static void main(String[] args) {
		PalindromeUsingRecursion p = new PalindromeUsingRecursion();
		//p.m1();
		String s = "MADAM";
		System.out.println(isPalindrome(s, 0, s.length()-1));
	}

	private static boolean isPalindrome(String s, int firstHalfPos, int secondHalfPos) {
		if (firstHalfPos < secondHalfPos) {
			return (s.charAt(firstHalfPos) == s.charAt(secondHalfPos))
					&& isPalindrome(s, firstHalfPos + 1, secondHalfPos - 1);
		}
		return true;
	}

}
