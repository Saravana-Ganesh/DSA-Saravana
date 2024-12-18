package com.queue.easy;

public class QueueUsingArrays {
	private int currentSize;
	private int totalCapacity;
	private int[] arr;
	private int front;
	private int rear;

	public QueueUsingArrays(int totalCapacity) {
		this.totalCapacity = totalCapacity;
		arr = new int[this.totalCapacity];
		this.front = 0;
		this.rear = -1;
		this.currentSize = 0;
	}

	public void enqueue(int a) {
		if (currentSize == totalCapacity) {
			System.out.println("Queue is Full...");
			return;
		}
		rear = (rear + 1) % (arr.length);
		arr[rear] = a;
		++currentSize;
	}

	public void deQueque() {
		if (currentSize == 0) {
			System.out.println("Queue is Already Empty...");
			return;
		}
		System.out.println("Element removed from the QUEUE:" + arr[front]);
		front = (front + 1) % arr.length;
		--currentSize;
	}

	public boolean isEmpty() {
		return currentSize == 0;
	}

	public int getSize() {
		return this.currentSize;
	}

	public int peek() {
		return arr[front];
	}
	
	public void printQueue() {
		System.out.println("========================PRINT QUEUE===================");
		for(int i=front;;) {
			System.out.println(arr[i]);
			if(i==rear)
				break;
			i= (i+1)%totalCapacity;
		}
		System.out.println("======================================================");

	}

	public static void main(String[] args) {
		QueueUsingArrays queue = new QueueUsingArrays(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.printQueue();
		System.out.println("First Elemnent in the Queue:"+queue.peek());
		queue.enqueue(100);
		queue.deQueque();
		queue.enqueue(100);
		System.out.println("First Elemnent in the Queue:"+queue.peek());
		queue.printQueue();
		queue.deQueque();
		queue.deQueque();
		queue.deQueque();
		System.out.println("First Elemnent in the Queue:"+queue.peek());
		queue.printQueue();
	}

}
