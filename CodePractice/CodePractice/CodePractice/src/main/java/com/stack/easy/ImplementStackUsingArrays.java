package com.stack.easy;

public class ImplementStackUsingArrays {
	private static class Stack{
		int top = -1;
		int array[] = new int[1000];
		void push(int a) {
			array[++top] = a;
			System.out.println("Pushed Value="+array[top]);
		}
		int pop() {
			if(top!=-1) {
				System.out.println("Poped Value="+array[top]);
				return array[top--];
			}
			System.out.println("Stack is empty");
			return -1;
		}
		void printStack() {
			System.out.println("==============STACK PRINTED====================");
			for(int i=this.top;i>-1;i--) {
				System.out.println(array[i]);
			}
			System.out.println("==================================================");
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		//s.pop();
		s.push(3);
		s.push(100);
		s.push(77);
		s.printStack();
		s.pop();
		s.printStack();
		s.pop();
		s.printStack();
		s.pop();
		s.pop();
		
	}

}
