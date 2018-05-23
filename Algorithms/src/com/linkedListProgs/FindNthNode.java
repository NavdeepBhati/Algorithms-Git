package com.linkedListProgs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindNthNode {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();;
		initializeList(list);

		int number = 7;
		findNthnodefromEnd(list, number);

	}

	private static void findNthnodefromEnd(List<Integer> list, int number) {

		Integer integer=0;
		Iterator<Integer> itrNode= list.iterator();
		Iterator<Integer> itr= list.iterator();
		
		
		
		for (int i = 0; i < number; i++) {
			if (itr.hasNext()) {
				itr.next(); 
				}
			else {
				System.out.println("not enough elements");
				return;
			}
			
			
		}
		
		while (itr.hasNext()) {
			
			Integer integer2 = (Integer) itr.next();

			 integer = (Integer) itrNode.next();
			System.out.println(integer2+"    "+integer);
		}
		
		System.out.println("Node at "+ number+ "   is  "+integer);
	}

	private static void initializeList(List<Integer> list) {

		
		for (int i = 1; i < 4; i++) {
			list.add(i * 10);
		}
System.out.println(list);
	}
}
