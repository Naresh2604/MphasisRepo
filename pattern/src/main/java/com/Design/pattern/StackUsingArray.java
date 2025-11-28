package com.Design.pattern;

public class StackUsingArray {
	private static int[] nums=new int[10];
	private static int  top=-1;
	
	public static boolean isEmpty() {
		return top==-1;
		
	}
	public  static boolean isFull() {
		return top==9;
		
	}
	public static void push(int ele) {
		if(isFull()) {
			System.out.println("stack overflow");
		}else {
			nums[++top]=ele;
		}
	}
	public static void pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
		}else {
			System.out.println(nums[top--]);
		}
	}
	public static void main(String[] args) {
		StackUsingArray.push(10);
		StackUsingArray.push(20);
		StackUsingArray.push(30);
		StackUsingArray.pop();
		StackUsingArray.pop();
		StackUsingArray.pop();
		
	}

}
