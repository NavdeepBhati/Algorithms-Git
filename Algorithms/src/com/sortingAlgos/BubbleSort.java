package com.sortingAlgos;

import java.util.Arrays;


/*
 * Not efficient Oreder is  O(n^2)
 * 
 * */
public class BubbleSort {

	public static void main(String[] args) {

		int[] intArray = { 8, 9, 43, 33, 867, 6, 5, 34, 3, 65, 65, 76, 999, 67, 6, 7, 4, 4, 2, 4, 4, 6, 11, 2, 44, 868,68, 6, 44, 4, 54, 54, 5, 45 };

//		bubbleSort(intArray);
		

		int temp;
		for (int i = 0; i < intArray.length - 1; i++) {

			for (int j = 1; j < intArray.length - i; j++) {

				if (intArray[j-1] < intArray[j]) {

					temp = intArray[j];
					intArray[j] = intArray[j-1 ];
					intArray[j-1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(intArray));

	}

	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
	}
	
}
