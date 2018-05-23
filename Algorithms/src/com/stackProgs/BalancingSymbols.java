package com.stackProgs;

import java.util.Scanner;
import java.util.Stack;

public class BalancingSymbols {

	public static void main(String[] args) {

		String str1 = "((A+B)-[C-D])";

		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		System.out.println("You entered string " + str);

		Boolean b = checkBalance(str);

		if (b) {
			System.out.println("String is balanced");
		} else {
			System.out.println("String is unbalanced");
		}

	}

	private static boolean checkBalance(String str) {

		Stack<String> stackList = new Stack();

		char[] strarray = str.toCharArray();

		int i = 0;

		int len = str.length();

		while (len > 0) {

			if (strarray[i] == '(') {
				stackList.add("(");

			} else if (strarray[i] == ')') {

				String temp = "(";

				if (!stackList.isEmpty() && stackList.peek().equals(temp)) {
					stackList.pop();
				} else {
					return false;
				}
			} else if (strarray[i] == '[') {
				stackList.add("[");

			} else if (strarray[i] == ']') {

				String temp = "[";

				if (!stackList.isEmpty() && stackList.peek().equals(temp)) {
					stackList.pop();
				} else {
					return false;
				}
			}
			len--;
			i++;
		}

		if (stackList.size() != 0) {
			return false;
		} else {
			return true;
		}
	}
}
