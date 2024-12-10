package com.linkedlist.easy;

public class LinkedList<T> {
	
	private ListNode<T> head;
	private ListNode<T> tail;
	private int size = -1;

	public void insert(T a) {
		if (head == null) {
			head = new ListNode<T>(a);
		} else if (tail == null) {
			this.tail = new ListNode<T>(a);
			head.next = tail;
		} else {
			tail.next = new ListNode<T>(a);
			tail = tail.next;
		}
		++size;
	}

	public void printLinkedList() {
		ListNode<T> temp = head;
		while (temp != null) {
			System.out.print(temp + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		return this.size;
	}

	public ListNode<T> getHeadNode() {
		return this.head;
	}

	public ListNode<T> getTailNode() {
		return this.tail;
	}

}
