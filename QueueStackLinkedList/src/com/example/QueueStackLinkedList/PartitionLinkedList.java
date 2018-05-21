package com.example.QueueStackLinkedList;

public class PartitionLinkedList {
	
//	Description
//	Given a linked list and a target value T, 
//	partition it such that all nodes less than T are listed before the nodes larger than or equal to target value T. 
//	The original relative order of the nodes in each of the two partitions should be preserved.
//
//	Examples
//
//	L = 2 -> 4 -> 3 -> 5 -> 1 -> null, T = 3, is partitioned to 2 -> 1 -> 4 -> 3 -> 5 -> null


	public ListNode partition(ListNode head, int target) {
	    // Write your solution here
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode small = new ListNode(0);
		ListNode large = new ListNode(0);
		ListNode currSmall = small;
		ListNode currLarge= large;		
		
		while (head != null) {
			if (head.value < target) {
				currSmall.next = head;
				currSmall = currSmall.next;
			}
			else {
				currLarge.next = head;
				currLarge = currLarge.next;
			}
			head = head.next;
		}
		
		currLarge.next = null;
		currSmall.next = large.next;
		return small.next;
	  }
}
