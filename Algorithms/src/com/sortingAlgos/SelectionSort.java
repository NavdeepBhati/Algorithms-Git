package com.sortingAlgos;

import java.util.Arrays;
/*
 * 	Better than bubble sort as no extra space is needed 
	Complexity is O(n^2)
*/
public class SelectionSort {

	
	public static void main(String[] args) {
		
		int[] intArray = {8,5,4,9,7,2};
		
		int temp, index,minValue=0;
		for (int i = 0; i < intArray.length; i++) {
			
			index=i;
			for (int j = i+1; j < intArray.length; j++) {
				
				
				if (intArray[j] < intArray[index]) {
					
					minValue=intArray[j];
					 index=j;
				}
			}
			
			temp=intArray[i];
			intArray[i]=minValue;
			intArray[index]=temp;
			
		}
		System.out.println(Arrays.toString(intArray));
	}
}
