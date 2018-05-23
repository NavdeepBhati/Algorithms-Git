package com.linkedListProgs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;


import com.linkedListProgs.LinkedListImplementation.Node;

public class RemoveDuplicatesLinkedListimpl {

	public static void main(String[] args) {


		LinkedListImplementation list = new LinkedListImplementation();

		
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,2,4,2,4,5);
		
		
		
		for (Integer integer : listInt) {
			list.push(integer);
		}
		
		/*	Random random = new Random();
		
		for (int i = 1; i < 10; i++) {
			list.push(i * 10);
			
		int randomNumber=	(int) (Math.floor(Math.random()*10)*10);
			
			list.push(randomNumber);
		}
	*/	list.iterate();

		
		RemoveDuplicatesLinkedListimpl removeDopl= new RemoveDuplicatesLinkedListimpl();
		
		
		removeDopl.removeDuplicates(list);
		
		
	}

	private void removeDuplicates(LinkedListImplementation list) {

		Node temp  =list.head;
		
		
		Set<Integer>   nodeSet = new HashSet<>();
		while (temp!=null) {
			
			if (!nodeSet.add(temp.data)) {
				list.deleteData(temp.data);
			}
			temp= temp.next;
		}

		list.iterate();
	}
	
	
}
