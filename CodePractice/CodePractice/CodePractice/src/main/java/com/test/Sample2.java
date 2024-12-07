package com.test;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println(fun(100));
	}

	/*
	 * To understand the log this function was implemented
	 */
	private static int fun(int n) {
		if (n == 1)
			return 0;
		return 1 + fun(n / 2);
	}

	private static void printBinaryUsingRecursion(int n) {
		if (n == 0)
			return;
		printBinaryUsingRecursion(n / 2);
		System.out.print(n % 2);
	}


	public static void printBinaryUsingInteration(int n) {
		int divisor = 1;

		// Find the highest power of 2 less than or equal to n
		while (divisor <= n / 2) {
			divisor *= 2;
		}

		// Print the binary representation
		while (divisor > 0) {
			if (n >= divisor) {
				System.out.print(1);
				n -= divisor;
			} else {
				System.out.print(0);
			}
			divisor /= 2;
		}
	}

	public static void printBinaryUsingBitwise(int n) {
		boolean leadingZero = true; // To skip leading zeros
		for (int i = 31; i >= 0; i--) { // Iterate from the most significant bit to the least
			int bit = (n >> i) & 1; // Extract the i-th bit
			if (bit == 1) {
				leadingZero = false; // Start printing once we find the first 1
			}
			if (!leadingZero) {
				System.out.print(bit);
			}
		}
		if (leadingZero) { // If all bits are zero, print a single 0
			System.out.print(0);
		}
	}

}
