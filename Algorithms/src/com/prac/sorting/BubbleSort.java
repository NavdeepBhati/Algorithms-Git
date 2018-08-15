package com.prac.sorting;

import java.util.Arrays;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		int[] intArray = { 8, 5, 4, 9, 7, 2 };
	//	sort(intArray);
		sortOptimzed(intArray);
	}

	private static void sortOptimzed(int[] intArray) {
		int count = 0;
		int temp;
		for (int i = 0; i < intArray.length - 1; i++) {

    			for (int j = 1; j < intArray.length - i; j++) {
				count++;
				if (intArray[j-1] >intArray[j]) {

					temp = intArray[j];
					intArray[j] = intArray[j-1 ];
					intArray[j-1] = temp;
				}
				System.out.println(Arrays.toString(intArray));
			}
		}
		System.out.println("optimized  "+"count  "+count+"   "+Arrays.toString(intArray));
		
	}

	private static void sort(int[] intArray) {
		int count = 0;
		for (int i = 0; i < intArray.length; i++) {
		
			for (int j = 0; j < intArray.length-1; j++) {
				
				count++;
				if (intArray[j]>intArray[j+1]) {
					
					int temp=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}
				
				
			}
		
		}
		
		System.out.println("NOtoptimized  "+"count  "+count+"   "+Arrays.toString(intArray));

	}
}
