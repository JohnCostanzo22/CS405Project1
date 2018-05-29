package com.ualbany.hw1.problem3;

/*
 * Class stores first and last names and links an Address and a CheckingBankAccount
 */
public class Person {

	private String firstName, lastName;
	private CheckingBankAccount checkingBankAccount;
	private Address address;
	
	//Constructor that requires a firstName and lastName
	//checkingBankAccount and address need to be added seperately
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//Accessor method for firstName
	public String getFirstName() {
		return firstName;
	}

	//Mutator method for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Accessor method for lastName
	public String getLastName() {
		return lastName;
	}

	//Mutator method for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//Accessor method for Address
	public Address getAddress() {
		return address;
	}
	
	//Mutator method for Address. Creates an address object from the given Strings
	public void setAddress(String line1, String line2, String city, String state, String zipcode) {
		address = new Address(line1, line2, city, state, zipcode);
	}

	//Accessor method for checkingBankAccount
	public CheckingBankAccount getCheckingBankAccount() {
		return checkingBankAccount;
	}
	
	//Creates a new CheckingBankAccount with an intial depsoit
	public void openCheckingBankAccount(double initialDeposit) {
		this.checkingBankAccount = new CheckingBankAccount(initialDeposit);
	}
	
}
