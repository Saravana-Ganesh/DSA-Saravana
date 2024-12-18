package com.linkedlist.easy;

public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode a1 = headA;
		ListNode b1 = headB;
		
		int countA1=0,countB1=0;
		
		while(a1!=null) {
			++countA1;
			a1=a1.next;
		}
		while(b1!=null) {
			++countB1;
			b1=b1.next;
		}
		int diff = countA1>countB1?countA1-countB1:countB1-countA1;
		
		if(countA1>countB1) {
			while(diff>0) {
				headA = headA.next;
				--diff;
			}
		}else {
			while(diff>0) {
				headB = headB.next;
				--diff;
			}
		}
		while(headA!=headB) {
			headA = headA.next;
			headB = headB.next;
		}
		
		return headA;
	}

}
