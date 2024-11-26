package com.recursion.easy;

public class PalindromeUsingRecursion {
	
	private static int MAX_POS=0;

	public static void main(String[] args) {
		String s = "MADAM";
		if ((s.length() & 1) == 1) {
			MAX_POS = s.length() / 2;
		} else {
			MAX_POS = (s.length() / 2) - 1;
		}
		System.out.println(isPalindrome(s, 0, s.length()-1));
	}

	private static boolean isPalindrome(String s, int firstHalfPos, int secondHalfPos) {
		if (firstHalfPos <= MAX_POS) {
			return (s.charAt(firstHalfPos) == s.charAt(secondHalfPos))
					&& isPalindrome(s, firstHalfPos + 1, secondHalfPos - 1);
		}
		return true;
	}

}
