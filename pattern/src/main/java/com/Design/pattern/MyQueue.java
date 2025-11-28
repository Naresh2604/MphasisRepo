package com.Design.pattern;

public class MyQueue {
	private static int front=-1;
	private static int rear=-1;
	private static int[] queue=new int[10];
	
	public static boolean isEmpty() {		return front==-1;
	}
	public static boolean isFull() {
		return rear==queue.length-1;
	}
	public static void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue is full");
			
		}else {
			if(front==-1) {
				front=0;
			}queue[++rear]=data;
			System.out.println("inserted data" + data + "into the queue");
		}
	}
	public static void delete() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			front=rear=-1;
		}else {
			System.out.println("element deleted");
		}
	}
			

}
