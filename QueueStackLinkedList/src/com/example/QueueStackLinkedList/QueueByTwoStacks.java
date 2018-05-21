package com.example.QueueStackLinkedList;

import java.util.LinkedList;

public class QueueByTwoStacks {

	private LinkedList<Integer> in;
	private LinkedList<Integer> out;

	// <- out | in <-
	// 1,2,3,4 to in, in : {4,3,2,1}
	// move to out : {1,2,3,4}
	// only operate in the head
	public QueueByTwoStacks() {
		// Write your solution here.
		in = new LinkedList<>();
		out = new LinkedList<>();
	}

	public Integer poll() {
		move();
		return out.size() == 0 ? null : out.pollFirst();
	}

	public void offer(int element) {
		in.offerFirst(element);
	}

	public Integer peek() {
		move();
		return out.size() == 0 ? null : out.peekFirst();
	}

	private void move() {
		if (out.isEmpty()) {
			while (!in.isEmpty()) {
				out.offerFirst(in.pollFirst());
			}
		}
	}

	public int size() {
		return in.size() + out.size();
	}

	public boolean isEmpty() {
		return in.size() == 0 && out.size() == 0;
	}
}
