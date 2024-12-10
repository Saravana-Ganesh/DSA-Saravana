package com.arrays.easy.sort;

import java.util.Arrays;

public class SelectionSort {
	private static void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int tempMin = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[tempMin]) {
					tempMin = j;
				}
			}	
			if(tempMin!=i) {
				a[i]=a[i]^a[tempMin];
				a[tempMin]=a[i]^a[tempMin];
				a[i]=a[i]^a[tempMin];
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int arr[] = {13,46,24,52,20,9};
		SelectionSort.sort(arr);

	}

}
