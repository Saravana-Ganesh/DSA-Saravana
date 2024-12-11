package com.arrays.easy;

public class CheckArraySortedAndRotated {

	public static void main(String[] args) {
		int a[] = {2,1};
		System.out.println(check(a));
	}

	public static boolean check(int[] a) {
		boolean sortHappen = false;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				if (!sortHappen) {
					if (i == 1)
						return false;
					sortHappen = true;
					if (a[i] > a[0]) {
						return false;
					}
				}else {
					return false;
				}
			}
		}
		return true;
	}

}
