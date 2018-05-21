package com.example.QueueStackLinkedList;

import java.awt.datatransfer.FlavorListener;

//L = null, return null
//L = 1 -> null, return 1
//L = 1 -> 2 -> null, return 1
//L = 1 -> 2 -> 3 -> null, return 2
//L = 1 -> 2 -> 3 -> 4 -> null, return 2
		
public class MiddleNodeOfLinkedList {
	public ListNode middleNode(ListNode head) {
	    // Write your solution here
		if (head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
		
	  }
}
