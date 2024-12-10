package com.linkedlist.easy;

public class DetectLoopInLinkedList_II {
	//https://leetcode.com/problems/linked-list-cycle-ii/description/
	public static void main(String[] args) {

	}

	public ListNode detectCycle(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		while(fastPointer!=null && fastPointer.next!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer==fastPointer) {
				while(slowPointer!=head) {
					head=head.next;
					slowPointer=slowPointer.next;
				}
				return head;
			}
		}
		return  null;
	}
}
