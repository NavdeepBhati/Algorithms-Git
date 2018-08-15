package com.prac.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] intArray = { 8, 5, 4, 9, 7, 2 };

		sort(intArray);
	}

	private static void sort(int[] intArray) {
		int count = 0;
		for (int i = 0; i < intArray.length - 1; i++) {

			int temp;

			if (intArray[i] > intArray[i + 1]) {

				int small = intArray[i + 1];

				System.out.println(small);
				for (int j = 0; j <= i + 1; j++) {

					if (small < intArray[j]) {
						temp = intArray[i + 1];
						intArray[i + 1] = intArray[j];
						intArray[j] = temp;
						System.out.println(Arrays.toString(intArray));
					}
					
					count++;
				}

			}

		}
		System.out.println("count  " + count + "   " + Arrays.toString(intArray));
	}
}
