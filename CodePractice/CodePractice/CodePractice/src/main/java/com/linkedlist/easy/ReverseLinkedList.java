package com.linkedlist.easy;

public class ReverseLinkedList {
	private class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	private ListNode reverseListUsingIterativeApproach(ListNode currentNode) {
		ListNode previousNode = null;
		ListNode nextNode = currentNode;
		while(currentNode!=null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return currentNode;
	}
	
	private ListNode reverseListByRecursiveApproach(ListNode currentNode,ListNode prevNode) {
		if(currentNode.next==null) {
			currentNode.next = prevNode;
			return currentNode;
		}
		ListNode nextNode = currentNode.next;
		currentNode.next = prevNode;
		//prevNode = currentNode;
		return reverseListByRecursiveApproach(nextNode,currentNode);
	}

	public static void main(String[] args) {

	}
}
