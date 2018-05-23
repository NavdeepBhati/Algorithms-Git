package com.linkedListProgs;

import com.linkedListProgs.LinkedListImplementation.Node;

public class MiddleLinkedListImpl {

	public static void main(String[] args) {
		LinkedListImplementation list = new LinkedListImplementation();
		for (int i = 1; i < 15; i++) {
			list.push(i * 10);
		}
		list.iterate();

		MiddleLinkedListImpl middleLinkList = new MiddleLinkedListImpl();

		middleLinkList.findMiddleNode(list);
	}

	private void findMiddleNode(LinkedListImplementation list) {

		Node temp = list.head;
		Node temp2 = list.head;

		while (temp!=null && temp.next!= null ) {
			temp2 = temp2.next;
			temp=temp.next.next;
		}

		System.out.println("Miidle "+ temp2.data);
		
	}
}
