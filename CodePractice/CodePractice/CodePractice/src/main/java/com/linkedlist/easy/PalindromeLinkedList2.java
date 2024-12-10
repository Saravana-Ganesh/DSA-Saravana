package com.linkedlist.easy;

public class PalindromeLinkedList2 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int[] arr = {1,0,1,1};
		for(int i:arr) {
			linkedList.insert(i);
		}
		linkedList.printLinkedList();
		System.out.println(PalindromeLinkedList2.isPalindrome(linkedList.getHeadNode()));
	}
	public static boolean isPalindrome(ListNode head) {		
		//1, 2 3 2 1
		
		if(head==null) {
			return true;
		}
		if(head.next==null) {
			return true;
		}
		//Find the middle Node in the list
		ListNode slowPointer=head,fastPointer=head;
		while(fastPointer!=null && fastPointer.next!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		
		// slowPointer is the middle node. We have to reverse them
		
		ListNode currentNode = slowPointer;
		ListNode prevNode = null;
		ListNode temp = null;
		while(currentNode!=null) {
			temp = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = temp;
		}
		
		//Checking
		while(prevNode!=null) {
			if(prevNode.val!=head.val) {
				return false;
			}
			prevNode = prevNode.next;
			head = head.next;
		}
		
		
		
		return true;
	}
}
