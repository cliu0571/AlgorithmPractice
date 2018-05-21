package com.example.QueueStackLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class StackWithMin {

	private Deque<Integer> stack;
	private Deque<Integer> minStack;

	public StackWithMin() {
		// write your solution here
		stack = new LinkedList<>();
		minStack = new LinkedList<>();
	}

	public Integer pop() {
		if (stack.isEmpty()) {
			return -1;
		}
		
		Integer result = stack.pollFirst();
		
		if (minStack.peekFirst() == result) {
			minStack.pollFirst();
		}
		
		return result;
	}

	public void push(Integer element) {
		stack.offerFirst(element);
		if (minStack.isEmpty() || minStack.peekFirst() >= element) {
			minStack.offerFirst(element);
		}
	}

	public Integer top() {
		if (stack.isEmpty()) {
			return -1;
		}
		return stack.peekFirst();
	}

	public Integer min() {
		if (minStack.isEmpty()) {
			return -1;	
		}
		return minStack.peekFirst();
	}
}
