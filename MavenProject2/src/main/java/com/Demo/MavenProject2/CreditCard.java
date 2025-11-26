package com.Demo.MavenProject2;

public class CreditCard implements Payment {
    public void pay(double amount) {
        if (Payment.validateAmount(amount)) {
            System.out.println("Amount paid " + amount + " using creditcard");
        } else {
            System.out.println("Payment failed. Invalid amount");
        }
    }
}

