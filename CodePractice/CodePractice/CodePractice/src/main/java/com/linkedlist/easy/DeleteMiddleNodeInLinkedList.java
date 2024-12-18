package com.linkedlist.easy;

public class DeleteMiddleNodeInLinkedList {

	public static void main(String[] args) {

	}

	public ListNode deleteMiddle(ListNode head) {
		if(head==null || head.next==null) {
			return null;
		}
		if(head.next.next==null) {
			head.next=null;
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode previous = null;
		while(fast!=null && fast.next!=null) {
			previous = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		previous.next = previous.next.next;
		return head;
	}

}
