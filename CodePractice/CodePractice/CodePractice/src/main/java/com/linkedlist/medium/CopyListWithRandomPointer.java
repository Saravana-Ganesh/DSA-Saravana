package com.linkedlist.medium;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
	class Node {
		int val;
		Node next;
		Node random;

		Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}

		@Override
		public String toString() {
			String currentValue = this.val+"";
			String nextValue = this.next!=null?this.next.val+"":null;
			String randomValue = this.random!=null?this.random.val+"":null;
			return "currentValue=" + currentValue + "==Next=" + nextValue + "==Random=" +randomValue;
		}

	}

	public static void main(String[] args) {
		CopyListWithRandomPointer obj = new CopyListWithRandomPointer();
		obj.m1();
	}

	public void m1() {
		Integer arr[] = { 7, 13, 11, 10, 1 };
		Node head = new Node(7);
		Node tail = head;
		for (int i = 1; i < arr.length; i++) {
			tail.next = new Node(arr[i]);
			tail = tail.next;
		}
		Node temp = head;
		Integer a[] = { null, 0, 4, 2, 0 };
		for (int i = 0; i < a.length; i++) {
			Node temp2 = null;
			if (a[i] != null) {
				temp2 = head;
				while (a[i] > 0) {
					temp2 = temp2.next;
					--a[i];
				}
			}
			temp.random = temp2;
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			/*
			 * String currentValue = temp.val+""; String nextValue =
			 * temp.next!=null?temp.next.val+"":null; String randomValue =
			 * temp.random!=null?temp.random.val+"":null; System.out.println("currentValue="
			 * + currentValue + "==Next=" + nextValue + "==Random=" +randomValue);
			 */
			System.out.println(temp);
			temp = temp.next;
		}
		this.copyRandomList(head);
	}

	/*
	 * BRUTE-FORCE APPROACH
	 */
	public Node copyRandomListBruteForceApproach(Node head) {
		Map<Node, Node> map = new HashMap();
		Node tempHead = head;
		// Push actual & copied values in map
		while (tempHead != null) {
			map.put(tempHead, new Node(tempHead.val));
			tempHead = tempHead.next;
		}
		// Set links for next and random
		tempHead = head;

		while (tempHead != null) {
			map.get(tempHead).next = map.get(tempHead.next);
			map.get(tempHead).random = map.get(tempHead.random);
			tempHead = tempHead.next;
		}

		return map.get(head);

	}

	/*
	 * Optimal Approach Aim: Create copy node next to the individual original node
	 * Fill random node Fill next pointer & reassign actual node
	 */

	public Node copyRandomList(Node head) {
			Node originalNode = head;
			Node copyNode = null;
			// Below loop creates copy node next to the individual original node
			while (originalNode != null) {
				copyNode = new Node(originalNode.val);
				copyNode.next = originalNode.next;
				copyNode.random = originalNode.random;
				originalNode.next = copyNode;
				originalNode = copyNode.next;
			}
	
			copyNode = head.next;
			// Below loop sets actual value to the reference named with random
	
			while (copyNode != null) {
				if (copyNode.random != null) {
					copyNode.random = copyNode.random.next;
				}
				copyNode = copyNode.next!=null?copyNode.next.next:null;
			}
	
			// Fill Next node
	
			originalNode = head;
			copyNode = originalNode.next;
			Node copyHead = originalNode.next;
	
			while (originalNode != null) {
				originalNode.next = copyNode.next;
				originalNode = originalNode.next;
				if (originalNode != null) {
					copyNode.next = originalNode.next;
				}
				copyNode = copyNode.next;
			}
	
			return copyHead;

	}

}
