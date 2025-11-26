package com.Demo.MavenProject2;

public interface Payment {
	public void pay(double amount);
	public default void generateReceipt(double amount) {
		System.out.println("Receipt generated successfully:" +amount);
	}
	
	public static boolean validateAmount(double amount) {
		return amount>0;
	}

}
