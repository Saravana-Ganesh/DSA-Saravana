package com.linkedlist.hard;

import com.linkedlist.easy.ListNode;

public class ReverseLinkedListInKgroup {

	public static void main(String[] args) {

	}

	public ListNode reverseKGroup(ListNode head, int k) {
		//Handling Edge cases
		if(head==null || head.next==null || k==1) {
			return head;
		}
		
		//Declaring variables		
		ListNode currentNode = head;
		ListNode nextNode =  null;
		ListNode previuosNode = null;
		ListNode changableHead = null;
		ListNode previousEndNode = null;
		
		//Assuming head as null. Because head is changable since we are reversing the list
		final int N = getSize(head)/k;
		head = null;
		
		for(int i=1;i<=N;i++) {
			int temp_k=1;
			changableHead = currentNode;
			while(temp_k<=k) {
				nextNode = currentNode.next;
				currentNode.next = previuosNode;
				previuosNode = currentNode;
				currentNode = nextNode;
				++temp_k;
			}
			if(previousEndNode!=null) {
				previousEndNode.next = previuosNode;
			}
			changableHead.next = currentNode;
			previousEndNode = changableHead;
			if(head==null) {
				head = previuosNode;
			}
		}
		
		return head;
	}

	private static int getSize(ListNode head) {
		int size = 0;
		while (head != null) {
			head = head.next;
			++size;
		}
		return size;
	}

}
