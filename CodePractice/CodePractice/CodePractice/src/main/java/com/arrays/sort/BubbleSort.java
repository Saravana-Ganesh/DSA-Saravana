package com.arrays.sort;

import java.util.Arrays;

public class BubbleSort {

	private static void sort(int a[]) {
		boolean isSwapHappend = false;
		while (true) {
			isSwapHappend = false;
			for (int i = 1; i < a.length; i++) {
				if (a[i] < a[i - 1]) {
					isSwapHappend = true;
					int temp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = temp;
				}
			}
			if(!isSwapHappend) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	private static void normalSort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 5, 1, 4, 2, 8 };
		BubbleSort.sort(a);
	}

}
