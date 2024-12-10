package com.linkedlist.easy;

public class PalindromeLinkedList {
	private static boolean isOddLength = true;
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int[] arr = {1,0,1};
		for(int i:arr) {
			linkedList.insert(i);
		}
		linkedList.printLinkedList();
		System.out.println(PalindromeLinkedList.isPalindrome(linkedList.getHeadNode()));
	}
	

	public static boolean isPalindrome(ListNode head) {
		ListNode nextOfMiddleNode = getMiddlePos(head);
		ListNode tailNode = reverseListUptoMiddlePos(head, nextOfMiddleNode);
		if (isOddLength && tailNode != null) {
			tailNode = tailNode.next;
		}
		while (tailNode != null) {
			if (tailNode.val != nextOfMiddleNode.val) {
				return false;
			}
			tailNode = tailNode.next;
			nextOfMiddleNode = nextOfMiddleNode.next;
		}
		return true;
	}

	private static ListNode getMiddlePos(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		int count = 1;
		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			count += 2;
		}
		if (fastPointer.next != null) {
			++count;
		}
		if ((count & 1) == 0) {
			isOddLength = false;
		}
		return slowPointer.next;
	}

	private static ListNode reverseListUptoMiddlePos(ListNode head, ListNode nextOfMiddleNode) {
		ListNode currentNode = head;
		ListNode previousNode = null;
		ListNode nextNode = null;
		while (nextNode != nextOfMiddleNode) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

}
