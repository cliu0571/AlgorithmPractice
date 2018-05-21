package com.example.QueueStackLinkedList;

public class MergeTwoSortedLinkedList {
	
//	Merge two sorted lists into one large sorted list.
//
//	Examples
//
//	L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
//	L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
//	L1 = null, L2 = null, merge L1 and L2 to null
	
	public ListNode merge(ListNode one, ListNode two) {
	    // Write your solution here
		ListNode dummy = new ListNode(0);
		// You won't like to lost dummy since dummy is going to next and next...
		ListNode curr = dummy;
		
		while (one != null && two != null) {
			if (one.value < two.value) {
				curr.next = one;
				one = one.next;
			}
			else {
				curr.next = two;
				two = two.next;
			}
			
			curr = curr.next;
		}
		
		// link remaining nodes of one or two
		if (one != null) {
			curr.next = one;
		}else {
			curr.next = two;
		}
		
		return dummy.next;
	  }
}
