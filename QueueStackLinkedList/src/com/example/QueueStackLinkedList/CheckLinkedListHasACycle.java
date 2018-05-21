package com.example.QueueStackLinkedList;


// Check if a given linked list has a cycle. 
// Return true if it does, 
// otherwise return false.

public class CheckLinkedListHasACycle {
	public boolean hasCycle(ListNode head) {
	    // write your solution here
		if (head == null) {
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				return true;
			}
		}
		
	    return false;
	  }
}
