package com.arrays.easy.sort;

import java.util.Arrays;

public class InsertionSort {

	private static void sort(int a[]) {
		for(int i = 1; i < a.length; i++) {
		    if(a[i] < a[i-1]) {
		        int temp = a[i];  // Store the element that we want to insert into the sorted part
		        int j = i;  // Pointer for the position where we're trying to insert `a[i]`
		        
		        for(; j > -1; --j) {  // Start shifting elements to the right
		            if(a[j] >= temp && j != 0) {
		                a[j] = a[j-1];  // Shift the element one position to the right
		            } else if(a[j] < temp) {
		                a[j+1] = temp;  // Insert `temp` in the correct position
		                break;
		            }
		        }
		        
		        if(j == -1) {  // If the loop ended and `j` reached -1, we have to place `temp` at the start
		            a[0] = temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(a));  // Output the sorted array

	}

	public static void main(String[] args) {
		//int a[] = { 12, 11, 13, 5, 6 };
		int a[] = {100,99,98,97,96,2};
		InsertionSort.sort(a);
	}

}
/*
	100,99,98,97 
	99,100,98,97 (1)
	
    98,99,100,97 (3)
    
    98,99,100,100
    
    98,99,99,100
    98,98,99,100
    
    97,98,99,100 (4)
*/