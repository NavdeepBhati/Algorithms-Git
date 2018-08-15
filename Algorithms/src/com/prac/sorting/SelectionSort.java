package com.prac.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = {9, 8, 7, 5, 4, 2 };

		sort(intArray);

	}

	private static void sort(int[] intArray) {
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
			count++;
			int index = i;
			int small=intArray[i];
			for (int j = i + 1; j < intArray.length; j++) {
				
				
				if (intArray[j] < small) {
		                small = intArray[j];
		                index=j;    
		            }
				
				count++;
			
			}
			int temp = intArray[i];
			intArray[i] = intArray[index];
			intArray[index] = temp;
			
		}

		System.out.println(Arrays.toString(intArray));
		System.out.println(count);
	}
}
