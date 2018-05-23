
package com.sortingAlgos;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 8, 5, 4, 9, 7, 2 };

		insertionSort(intArray);
		
		
		
		int temp;
		for (int i = 0; i < intArray.length-1; i++) {

		/*	if (intArray[i] > intArray[i + 1]) {

				temp = intArray[i];
				intArray[i] = intArray[i + 1];
				intArray[i + 1] = temp;
			}*/

			for (int j = i; j > 0 && intArray[j]>intArray[i]; j--) {

				if (intArray[j] < intArray[j - 1]) {

					temp = intArray[j];
					intArray[j] = intArray[j - 1];
					intArray[j - 1] = temp;
				}

			}

		}

		System.out.println(Arrays.toString(intArray));

	}
	
	 public static void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	        }
			System.out.println(Arrays.toString(array));

	    }
}
