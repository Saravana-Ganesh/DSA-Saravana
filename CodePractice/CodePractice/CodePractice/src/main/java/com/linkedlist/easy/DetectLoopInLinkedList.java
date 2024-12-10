package com.linkedlist.easy;

public class DetectLoopInLinkedList {
	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {
		if(head!=null) {
			ListNode slowPointer = head;
			ListNode fastPointer = head;
			while(fastPointer!=null && fastPointer.next!=null) {
				fastPointer = fastPointer.next.next;
				slowPointer = slowPointer.next;
				if(fastPointer==slowPointer) {
					return true;
				}
			}
		}
		
		return false;
	}
}
