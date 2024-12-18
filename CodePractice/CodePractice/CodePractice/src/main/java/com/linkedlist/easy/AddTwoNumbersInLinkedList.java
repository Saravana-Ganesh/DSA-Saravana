package com.linkedlist.easy;

public class AddTwoNumbersInLinkedList {
	private class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum=0;
		ListNode tail = null,head=null;
		while(l1!=null || l2!=null) {
			if(l1!=null) {
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null) {
				sum+=l2.val;
				l2=l2.next;
			}

			if(head==null) {
				head = tail = new ListNode(sum%10);
			}else {
				tail.next = new ListNode(sum%10);
				tail = tail.next;
			}
			sum = sum>9?1:0;;
		}
		if(sum==1) {
			tail.next = new ListNode(1);
		}
		return head;
	}

}
