package com.linkedlist.easy;

public class FindLengthOfTheLoopInLinkedList {
	
	public int countNodesinLoop(Node head) {
		int count = 0;
		Node slowPointer = head;
		Node fastPointer = head;
		while(fastPointer!=null && fastPointer.next!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer == fastPointer) {
				fastPointer=fastPointer.next;
				while(slowPointer!=fastPointer) {
					++count;
					fastPointer=fastPointer.next;
				}
				return count;
			}
		}
		return count;
	}

	public static void main(String[] args) {

	}
}
