package com.ualbany.hw1.problem3;

/*
 * Class that holds a value and allows for deposits and withdrawls to be made
 */
public class CheckingBankAccount {

	private double value;
	
	//Constructor method
	public CheckingBankAccount(double value) {
		this.value = value;
	}
	
	//method to deposit an amount greater than 0 to value
	public void deposit(double amount) {
		if(amount > 0) {
			value = value + amount;
		} else {
			System.out.println("Invalid amount of money to deposit");
		}
	}
	
	//method to withdraw a positive amount from value
	public void withraw(double amount) {
		if(amount > 0) {
			value = value - amount;
		} else {
			System.out.println("Invalid amount of money to withdraw");
		}
	}
	
	//Accessor method for value
	public double getValue() {
		return value;
	}
}
