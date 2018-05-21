package com.example.QueueStackLinkedList;

public class ReversedLinkedList {
	// Iterative
	public ListNode reverse(ListNode head) {
	    // Write your solution here
		ListNode prev = null;
		
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		return prev;
		
	  }
	
	// Recursive
	public ListNode reverseRecursive(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
}

class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value) {
		this.value = value;
		next = null;
	}
}
