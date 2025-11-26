package com.Demo.MavenProject2;

public class Main {
	
	public static void main(String args[]) {
		CreditCard cc = new CreditCard();
		cc.pay(5000);
		
		Upi upi = new Upi();
		upi.pay(-800);
	}
 
}
 