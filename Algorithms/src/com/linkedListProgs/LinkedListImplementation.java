package com.linkedListProgs;

public class LinkedListImplementation {

	Node head;

	int length;

	class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
		

	}

	public void push(int data) {

		Node new_node = new Node(data);

		if (head == null) {
			head = new_node;
		}

		else {
			Node temp = head;
			for (int i = 1; i < length; i++) {

				temp = temp.next;
			}
			temp.next = new_node;
		}

		length++;

	}

	
	public boolean deleteData(int delData) {

		//System.out.println("length   " + length);

		int counter = 0;
		
		Node temp = head;
		
		
		if (delData == temp.data) {
			head = temp.next;
			length--;
				return true;
		}

		Node temp2;
		
		
		do {
			//System.out.println(temp.data);
			counter++;
			if (counter< length && delData==temp.next.data  ) {

				temp2 = temp.next.next;
				
				
				temp.next=temp2;
		
				length--;
				return true;
			}
			
			temp = temp.next;
		} while (temp != null);
		
		return false;
	}
	
	
	private void deleteAtIndex(int index) {

	}
	
	public void iterate() {

		System.out.println("length   " + length);

		Node temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != null);

	}

	
	public void getElement(int index) {

		int counter=0;
		
		System.out.println("length   " + length);

		if (index>length-1 || index<0) {
			System.err.println("Index out of bound");
			
		}
		
		Node temp = head;
		do {
			if (counter==index) {
				
				System.out.println(temp.data+"   index   "+index);	
			}
			
			temp = temp.next;
			counter++;
		} while (temp != null);

	}

	
	
	
	public void insertingNodeinBetween(int data, int index) {

		if (index > length - 1) {

			throw new IndexOutOfBoundsException("Cnnt be inserted at this position");
		} else if (index == length - 1) {
			push(data);
			return;
		} else {
			Node new_node = new Node(data);

			Node temp = head;
			Node temp2 = null;
			for (int i = 1; i < index; i++) {

				temp = temp.next;
				temp2 = temp.next;

			}

			length++;
			if (index == 1) {
				temp2 = temp.next;
			}

			if (index == 0) {

				head = new_node;
				head.next = temp;
				return;

			}
			temp.next = new_node;
			temp.next.next = temp2;

			length++;
		}

	}

	public void updateAtIndex(int data, int index) {

		Node temp = head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}

		temp.data = data;
	}

	public static void main(String[] args) {

		LinkedListImplementation list = new LinkedListImplementation();

		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);

		list.iterate();

		list.insertingNodeinBetween(1212, 0);

		list.iterate();

		list.updateAtIndex(777, 0);
		list.iterate();
		
		
		
		boolean b=list.deleteData(40);

		if(b)
			System.out.println("Data deleted");
		else 
			System.out.println("data Not avaialble");
		
		list.iterate();
		
		
		list.getElement(4);
	}
}
