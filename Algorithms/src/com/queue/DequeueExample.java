package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {

	public static void main(String[] args) {
		
		//Deque<Integer> dq= new LinkedList<>();
		Deque<Integer> dq= new ArrayDeque<>();
		
		/*for (int i = 0; i < 10; i++) {
			dq.push(i);
		}*/

		/*int len = dq.size();
		for (int i = 0; i < len; i++) {

			System.out.println("Value : "+dq.poll() + "   length: "+dq.size());
		}
*/
		dq.add(1);
		dq.offer(2);
		dq.push(3);
		
		dq.add(4);
		dq.offer(5);
		dq.push(6);
		
		String s = new String("Java");
		System.out.println(dq);
		dq.poll();
		
		System.out.println(dq);
		
	}
}
