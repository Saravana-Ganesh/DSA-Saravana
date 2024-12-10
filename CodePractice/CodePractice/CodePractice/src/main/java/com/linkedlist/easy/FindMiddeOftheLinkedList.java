package com.linkedlist.easy;

public class FindMiddeOftheLinkedList {
	private class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode middleNode(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while(fastPointer.next!=null && fastPointer.next.next!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		if(fastPointer.next==null) {
			return slowPointer;
		}
		return slowPointer.next;
		
	}

	public static void main(String[] args) {

	}

}
