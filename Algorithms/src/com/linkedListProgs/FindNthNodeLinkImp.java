package com.linkedListProgs;

import java.util.HashSet;
import java.util.Set;

import com.linkedListProgs.LinkedListImplementation.Node;

public class FindNthNodeLinkImp {

	public static void main(String[] args) {
		LinkedListImplementation list = new LinkedListImplementation();

		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.push(60);
		list.push(70);
		list.push(80);
		list.push(90);
		list.push(100);
		list.push(110);

		list.iterate();
		FindNthNodeLinkImp findObj = new FindNthNodeLinkImp();
		findObj.nthNodefromEnd(list, 3);
		System.out.println(findObj.checkLoop(list));

	
	
	}

	private boolean checkLoop(LinkedListImplementation list) {

		
		Set<Node> nodeSet= new HashSet<>();
		
		Node temp = list.head;

		while (temp.next!=null) {
			
			if (nodeSet.add(temp)) {
				
				return false;
			}
			temp=temp.next;
		}
		return false;
		
	}

	private void nthNodefromEnd(LinkedListImplementation list, int lastIndex) {

		int lastInd= lastIndex;
		Node temp = list.head;
		Node temp2 = list.head;

		while (lastIndex > 1) {
			temp = temp.next;
			lastIndex--;
		}

		while (temp.next != null) {
			temp2 = temp2.next;
			temp=temp.next;
			System.out.println("temp  " + temp.data + "  temp2 " + temp2.data);

		}

		System.out.println("Element at  " + lastInd + " from end is " + temp2.data);
	}
	
	
	
	
}
