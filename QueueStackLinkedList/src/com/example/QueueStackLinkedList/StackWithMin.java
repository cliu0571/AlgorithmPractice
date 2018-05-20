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
	    Integer result;
	    if (!stack.isEmpty()) {
	    	result = stack.
	    }
	  }
	  
	  public void push(Integer element) {
	    
	  }
	  
	  public Integer top() {
	    return -1;
	  }
	  
	  public Integer min() {
	    return -1;
	  }
}
