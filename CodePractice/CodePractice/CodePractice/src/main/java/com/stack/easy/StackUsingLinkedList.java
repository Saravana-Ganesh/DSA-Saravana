package com.stack.easy;

class Node {
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data = data;
	}
}

public class StackUsingLinkedList {
	Node head;
	Node tail;
	
	public void push(int a) {
		if(head==null) {
			head = new Node(a);
			tail = head;
			return;
		}
		tail.next = new Node(a);
		tail.next.prev = tail;
		tail = tail.next;
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("No elements in STACK");
			return -1;
		}
		int data = tail.data;
		tail = tail.prev;
		if(tail!=null) {
			tail.next.prev=null;
			tail.next=null;
		}else {
			head = null; //Assume only one value in list and that value is removed now
			//so we are pointing head as null
		}
		System.out.println("Element removed from stack::"+data);
		return data;
	}
	
	public void print() {
		Node temp = tail;
		System.out.println("===========Elements in Stack=========");
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		System.out.println("=====================================");
	}
	
	public static void main(String[] args) {
		StackUsingLinkedList list = new StackUsingLinkedList();
		list.push(2);
		list.push(3);
		list.push(10);
		list.print();
		list.pop();
		list.print();
		list.pop();
		list.print();
		list.push(100);
		list.print();
		list.pop();
		list.print();
		list.pop();
		list.print();
		list.pop();
	}
}
