package com.program.Threads;

public class MyThread extends Thread {
	public void run() {
		System.out.println( "thread " + this.getName() +" is running");
		for(int i=0;i<=5;i++) {
			System.out.println(this.getName()+ " value:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
	
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();

	}

}
