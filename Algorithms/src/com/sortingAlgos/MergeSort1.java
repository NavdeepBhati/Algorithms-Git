package com.sortingAlgos;

public class MergeSort1 {

	
	
	
	public static void main(String[] args) {
		
		int[] intArray = { 8, 5, 4, 9, 7, 2 };
	
		int lastindex= intArray.length;
		int firstIndex= lastindex-intArray.length;
		
		mergeSort(intArray, lastindex, firstIndex);
		
	}

	
	static void merge(int arr[], int l, int m, int r){
         // Your code here
    }

	
	
	static void mergeSort(int arr[], int l, int r) {
	 
	    if (l < r)   
	   {
	        int m = (l+r)/2;
	        mergeSort(arr, l, m);
	        mergeSort(arr , m+1, r);
	        merge(arr, l, m, r);
	    }
	}
}
