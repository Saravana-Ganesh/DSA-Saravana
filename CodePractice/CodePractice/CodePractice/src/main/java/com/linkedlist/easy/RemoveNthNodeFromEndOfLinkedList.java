package com.linkedlist.easy;

public class RemoveNthNodeFromEndOfLinkedList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return head;
		} else if (head.next == null & n == 1) {
			return null;
		}
		ListNode fastPointer = head;
		int i = 1;
		for (; i <= n; i++) {
			fastPointer = fastPointer.next;
		}
		ListNode slowPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
		if (fastPointer == null) {
			head = head.next;
		} else {
			slowPointer.next = slowPointer.next.next;
		}
		return head;
	}

	public static void main(String[] args) {

	}
}
