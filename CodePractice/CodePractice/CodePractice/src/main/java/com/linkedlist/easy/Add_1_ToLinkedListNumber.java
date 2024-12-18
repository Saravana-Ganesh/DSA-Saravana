package com.linkedlist.easy;

public class Add_1_ToLinkedListNumber {
	Node head;
	class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	public Node addOne(Node head) {
		//9 9 7 6 3 7
		Node temp = head;
		Node prev = null;
		while(temp.next!=null) {
			if(prev!=null && temp.next.data!=9) {
				prev = null;
			}
			if(prev==null && temp.next.data==9) {
				prev = temp;
			}
			temp = temp.next;
		}
		if(prev!=null) {
			if(prev.data==9 && prev==head) {
				while(prev!=null) {
					prev.data = 0;
					prev = prev.next;
				}
				Node head1 = new Node(1);
				head1.next = head;
				return head1;
			}else if(prev.data!=9 && temp.data==9){
				prev.data = prev.data+1;
				prev = prev.next;
				while(prev!=null) {
					prev.data = 0;
					prev = prev.next;
				}
			}
			
		}else {
			temp.data = temp.data+1;
		}
		return head;
	}
	
	public void insert(int a) {
		if(head==null) {
			head = new Node(a);
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new Node(a);
		}
	}

	public static void main(String[] args) {
		//9 9 7 6 3 7
		int arr[] = {9,9,7,6,3,7};
		Add_1_ToLinkedListNumber obj = new Add_1_ToLinkedListNumber();
		for(int i:arr) {
			obj.insert(i);
		}
		obj.addOne(obj.head);
	}
}
