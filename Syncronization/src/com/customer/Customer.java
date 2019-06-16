package com.customer;

public class Customer {
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw..");
		if(this.amount<amount) {
			try {
				wait();
			} 
			catch (Exception e) {}
			
		}
		this.amount-=amount;
		System.out.println("Withdraw completed..");
	}
	
	synchronized void deposit(int amount) {
		System.out.println("Goint to Deposit");
		this.amount+=amount;
		System.out.println("Deposit completed..");
		
		notify();
	}
}
