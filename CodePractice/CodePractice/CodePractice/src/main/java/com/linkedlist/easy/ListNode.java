package com.linkedlist.easy;

public class ListNode<T> {
	public T val;
	public ListNode<T> next=null;
	
	public ListNode(){
		
	}

	public ListNode(T x) {
		this.val = x;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return this.val+"";
	}
}
