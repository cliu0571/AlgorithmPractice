package com.example.QueueStackLinkedList;

public class InsertInLinkedList {
	
//	Insert a value in a sorted linked list.
//
//	Examples
//
//	L = null, insert 1, return 1 -> null
//	L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
//	L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
//	L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null
			
	public ListNode insert(ListNode head, int value) {
	    // Write your solution here
		ListNode newNode = new ListNode(value);
		
		if (head == null || head.value >= value) {
			newNode.next = head;
			return newNode;
		}
		
		ListNode prev = head;
		
		while(prev.next != null && prev.next.value < value) {
			prev = prev.next;
		}
		newNode.next = prev.next;
		prev.next = newNode;
		return head;
	  }
}
