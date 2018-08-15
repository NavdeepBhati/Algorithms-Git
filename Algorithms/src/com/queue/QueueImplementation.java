package com.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class QueueImplementation {

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

	public int poll() {

		int data = 0;

		if (head == null) {
			System.err.println("Queue is empty");
			return data;
		}

		else {
			data = head.data;
			head = head.next;
			length--;
		}
		return data;
	}

	public static void main(String[] args) {

		QueueImplementation queue = new QueueImplementation();

		for (int i = 0; i < 10; i++) {
			queue.push(i);
		}

		int len = queue.length;
		for (int i = 0; i < len; i++) {

			System.out.println("Value : "+queue.poll() + "   length: "+queue.length);
		}

		example();
	}

	private static void example() {
		int len = 5;
		Random random = new Random();

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(len);
		LinkedList<Integer> linkedList = new LinkedList<>();

		System.out.println("Random number generated:");
		for (int i = 0; i < len; i++) {
			Integer randomNumber = new Integer(random.nextInt(100));
			linkedList.add(new Integer(randomNumber));
			priorityQueue.add(new Integer(randomNumber));
			System.out.println(i + ": " + randomNumber);
		}
		System.out.println("Number in linkedList:");
		for (int i = 0; i < len; i++) {
			Integer item = linkedList.poll();
			System.out.println(i + ": " + item);
		}
		System.out.println("Number in priorityQueue:");
		for (int i = 0; i < len; i++) {
			Integer item = priorityQueue.poll();
			System.out.println(i + ": " + item);
		}
	}

}
