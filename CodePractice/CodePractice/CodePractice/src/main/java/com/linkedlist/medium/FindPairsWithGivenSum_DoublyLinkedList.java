package com.linkedlist.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given a sorted doubly linked list of positive distinct elements, 
 * the task is to find pairs in a doubly-linked list whose sum is equal to given value target.
 * 
 * Input:  
	1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
	target = 7
	Output: (1, 6), (2,5)
	Explanation: We can see that there are two pairs 
	(1, 6) and (2,5) with sum 7.
 */
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class FindPairsWithGivenSum_DoublyLinkedList {

	public static void main(String[] args) {
	}
	
	public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
		if(head==null || head.next==null) {
			return (ArrayList<ArrayList<Integer>>) Collections.EMPTY_LIST;
		}
		//Create two pointers, start and end
		Node start = head;
		Node end = head;
		
		//Move end pointer to the last position
		
		while(end.next!=null) {
			end = end.next;
		}
		int temp;
		ArrayList<ArrayList<Integer>> allList = new ArrayList();
		while(start!=end && start.prev!=end.prev) {
			temp = target-start.data;
			if(temp == end.data) {
				ArrayList<Integer> list = new ArrayList<Integer>(6);
				list.add(start.data);
				list.add(end.data);
				allList.add(list);
				start = start.next;
				end = end.prev;
			}else if(temp>end.data) {
				start = start.next;
			}else {
				end = end.prev;
			}
		}
		return allList;
	}

}
