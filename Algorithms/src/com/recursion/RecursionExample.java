package com.recursion;

import java.util.Arrays;

public class RecursionExample {

	public static void main(String[] args) {

		// System.out.println(factorial(4));

		// System.out.println(stringReverse("hello"));

		int[] array = { 1, 3, 14, 5, 25, 60 };

		int a = 1;
		// System.out.println(isArraySorted(array, array.length));

		// System.out.println(reverseString("hello"));

		// System.out.println(reverseWords("The fox jumps over the lazy dog"));
		 System.out.println(reverseWordsLoop("The fox jumps over the lazy dog"));

		//System.out.println(reverseNumber(1234));

		//System.out.println(reverseStringLoop("Hello"));
		//fibonacciRecursion();
	}

	private static String reverseStringLoop(String str) {

		char[] strChar = str.toCharArray();
		int j = strChar.length - 1;
		for (int i = 0; i < strChar.length / 2; i++) {

			char temp;

			temp = strChar[i];
			strChar[i] = strChar[j];
			strChar[j] = temp;
			j--;
		}

		return new String(strChar);
	}

	private static boolean isArraySorted(int[] array, int index) {

		if (index == 1) {
			return true;
		}

		System.out.println("index-1   " + array[index - 1] + "    index-2    " + array[index - 2]);
		if (array[index - 1] < array[index - 2]) {

			return false;
		} else {
			return isArraySorted(array, index - 1);
		}
	}

	private static int factorial(int i) {

		if (i == 1)
			return 1;

		else
			return i * factorial(i - 1);

	}

	public static String stringReverse(String str) {
		if (str.length() == 1) {

			return str;
		}

		String s = str.charAt(str.length() - 1) + stringReverse(str.substring(0, str.length() - 1));

		System.out.println("   " + s);
		return s;
	}

	public static String reverseWords(String str) {

		String[] sArray = str.split("\\s");

		StringBuilder sb = new StringBuilder();

		
		
		for (int i = sArray.length - 1; i >= 0; i--) {
			sb.append(sArray[i] + " ");
		}

		return sb.toString();
	}
	private static String reverseWordsLoop(String str) {

		String[] sArray = str.split(" ");
		int j = sArray.length - 1;
		for (int i = 0; i < sArray.length / 2; i++) {

			String temp;

			temp = sArray[i];
			sArray[i] = sArray[j];
			sArray[j] = temp;
			j--;
		}

		String  s =sArray.toString();
		
		return new String(Arrays.toString(sArray));
	}
	public static int reverseNumber(int i) {

		int ri = 0;
		while (i > 0) {

			ri = ri * 10 + i % 10;

			i = i / 10;
		}

		return ri;
	}

	public static void fibonacciRecursion() {

		
		
	}

}
