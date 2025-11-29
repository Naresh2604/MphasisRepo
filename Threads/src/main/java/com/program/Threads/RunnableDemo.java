package com.program.Threads;

public class RunnableDemo implements Runnable {
	public void run() {
		System.out.println("thread running");
		
	}

	public static void main(String[] args) {
		Thread t=new Thread(new RunnableDemo());
		t.start();
		

	}
	

}
