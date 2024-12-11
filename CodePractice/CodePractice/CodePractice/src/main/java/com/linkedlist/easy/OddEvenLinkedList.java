package com.linkedlist.easy;

public class OddEvenLinkedList {
	public static ListNode oddEvenList(ListNode head) {
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while(even!=null && even.next!=null) {
			odd.next = even.next;
			odd = odd.next;
			
			even.next=odd.next;
			even = even.next;
			
		}
		odd.next=evenHead;
		return head;
		
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		int[] arr = { 1, 2, 3, 4 };
		for (int i : arr) {
			linkedList.insert(i);
		}
		linkedList.printLinkedList();
		OddEvenLinkedList.oddEvenList(linkedList.getHeadNode());
		linkedList.printLinkedList();
	}
}
