package com.linkedlist.easy;

public class ListRotate {

	public static void main(String[] args) {

	}

	public ListNode rotateRight(ListNode head, int k) {
		//Handle edge cases
		if(head==null || head.next==null || k<1) {
			return head;
		}
		//Traverse till end of the list for 2 goals.
		//Goal 1: Find the length of the list
		//Goal 2: Set last node.next to head to implement rotate logic
		
		ListNode tempHead = head;
		//Declare list size as 1 initially
		int listSize = 1;
		while(tempHead.next!=null) {
			++listSize;
			tempHead = tempHead.next;
		}
		tempHead.next = head;
		//Avoid overflow 
		k = k%listSize;
		int pos = listSize-k;
		//Traverse listSize-K positions
		if(pos<1) {
			return head;
		}
		tempHead = head;
		for(int i=1;i<pos;i++) {
			tempHead = tempHead.next;
		}
		head = tempHead.next;
		tempHead.next = null;
		return head;
	}

}
