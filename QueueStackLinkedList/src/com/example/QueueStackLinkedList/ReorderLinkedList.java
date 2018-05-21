package com.example.QueueStackLinkedList;

public class ReorderLinkedList {

	// Description
	// Reorder the given singly-linked list N1 -> N2 -> N3 -> N4 -> … -> Nn -> null
	// to be N1- > Nn -> N2 -> Nn-1 -> N3 -> Nn-2 -> … -> null
	//
	// Examples
	//
	// L = null, is reordered to null
	// L = 1 -> null, is reordered to 1 -> null
	// L = 1 -> 2 -> 3 -> 4 -> null, is reordered to 1 -> 4 -> 2 -> 3 -> null
	// L = 1 -> 2 -> 3 -> null, is reordred to 1 -> 3 -> 2 -> null

	public ListNode reorder(ListNode head) {
		// Write your solution here
		// 1 split the LinkedList into 2 parts
		// 2 reverse the second part
		// 3 merge them one by one
		if (head == null || head.next == null) {
			return head;
		}

		ListNode mid = findMiddleNode(head);

		ListNode one = head;
		ListNode two = mid.next;

		mid.next = null;

		return merge(one, reverse(two));
	}

	private ListNode merge(ListNode one, ListNode two) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;

		while (one != null && two != null) {
			curr.next = one;
			one = one.next;
			curr = curr.next;
			curr.next = two;
			two = two.next;
			curr = curr.next;
		}

		if (one != null) {
			curr.next = one;
		} else {
			curr.next = two;
		}
		
		return dummy.next;
	}

	private ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;

	}

	private ListNode findMiddleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
