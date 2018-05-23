package com.linkedListProgs;

import com.linkedListProgs.LinkedListImplementation.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedListImplementation list = new LinkedListImplementation();
		for (int i = 1; i < 15; i++) {
			list.push(i * 10);
		}
		list.iterate();

		ReverseLinkedList rl = new ReverseLinkedList();
		Node current = list.head;
		
		Node prevTemp=null;
		
		// rl.reverse(list);
		Node prev = rl.reverseUsingRecursion(current,prevTemp);

		list.head = prev;

		list.iterate();

	}

	private Node reverseUsingRecursion( Node current,Node prev) {


		if (current == null) {
			return prev;
		}

		Node next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		
		System.out.println("prev" +prev.data);
		return reverseUsingRecursion( current,prev);

		
	}

	private void reverse(LinkedListImplementation list) {

		Node current = list.head;
		Node prev = null;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		// [10,20]-->[20,30]-->[30,40]-->[40,59]-->---------Original
		// [10,null]<--[20,10]<--[30,20]<--[40,30]-----------Reversing

		list.head = prev;

		list.iterate();
	}

}
