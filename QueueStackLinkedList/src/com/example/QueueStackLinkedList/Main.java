package com.example.QueueStackLinkedList;

public class Main {

	public static void main(String[] args) {
		QueueByTwoStacks queue = new QueueByTwoStacks();
		int[] array = new int[] {1,2,3,4,5};
		for(int num : array) {
			queue.offer(num);
		}
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
	}

}
