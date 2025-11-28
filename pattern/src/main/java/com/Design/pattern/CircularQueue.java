package com.Design.pattern;

public class CircularQueue {
	private static int front=-1;
	private static int rear=-1;
	private static int cq[] =new int[10];
	
	public CircularQueue() {
		front=-1;
		rear=-1;
	}
	public static boolean isEmpty() {
		return front==-1;
	}
	public static boolean isFull() {
		return (front==0 && rear==cq.length-1 || (rear+1)%cq.length==front);
	}
	public static void insert(int data) {
		if(isFull()) {
			System.out.println("queue overflow");
		}else {
			if(rear==-1) {
				cq[rear++]=data;
				front=0;
			}else {
				rear=(rear+1)%10;
				cq[rear++]=data;
				System.out.println(data +"data inserted successfully");
			}
		}
	}public static void delete() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else {
			System.out.println(cq[front]+ "delete successfully");
			front++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
