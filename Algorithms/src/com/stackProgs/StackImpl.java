package com.stackProgs;

import java.util.Stack;

public class StackImpl {

	Node head;
	int length;

	class Node {

		private int value;
		private Node next;

		Node(int value) {

			this.value = value;
			this.next = null;
		
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	// [10,null]<--[20,10]<--[30,20]<--[40,30]<--[50,40]----HEAD
	public void push(int value) {
		Node oldHead = head;
		head = new Node(value);
		head.next = oldHead;
	
	length++;
	}

	public int pop() {

		if (head == null) {
			System.err.println("Stack is empty");
			throw new RuntimeException("Stack is empty");
		}
		Node new_head= head.getNext();
		int value= head.getValue();
		head=new_head;
		length--;
		return value;
				
	}

	
	
	public int peek() {
		if (head == null) {
			System.err.println("Stack is empty");
			throw new RuntimeException("Stack is empty");
		}
		int value= head.getValue();
		return value;
	}
	
	public void iterate() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		StackImpl stack = new StackImpl();
		
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		stack.iterate();
		
		System.out.println();
		System.out.println("Pop   "+stack.pop());
		
		
		stack.iterate();

		System.out.println();
		System.out.println("Peek   "+ stack.peek());
		
		System.out.println("length  "+stack.length);
		
		
		Stack<Integer> st = new Stack<>();
		
	}

}
