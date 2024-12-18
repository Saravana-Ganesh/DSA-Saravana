package com.linkedlist.medium;

/*class Node{
	int data;
	Node next,prev;
	Node(int x){
		this.data = x;
		this.next = null;
		this.prev 	= null;
	}
}*/

public class RemoveDuplicateNodesFromSortedDDLL {

	public static void main(String[] args) {

	}

	Node removeDuplicates(Node head) {
		// Handling the edge cases
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				Node removableObj = temp.next;
				removableObj.prev = null; // Make object eligible for garbage collection
				temp.next = removableObj.next; // temp ignore the duplicate
				removableObj.next = null; // Make object eligible for garbage collection
				if (temp.next != null) {
					temp.next.prev = temp;
				}
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

}
