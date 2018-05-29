package com.ualbany.hw1.problem3;

import java.util.ArrayList;

/*
 * Bank that has a list of Person associated with it and an Address
 * Also includes a main method for testing
 */
public class Bank {

	private ArrayList<Person> personList = new ArrayList<>();
	private String name;
	private Address address;
	
	//Constructor that sets name. personList and address are not set
	public Bank(String name) {
		this.name = name;
	}
	
	//Accessor method for name
	public String getName() {
		return name;
	}
	
	//Mutator method for name
	public void setName(String name) {
		this.name = name;
	}
	
	//Accessor method for address
	public Address getAddress() {
		return address;
	}
	
	//Creates a new address object with the given Strings
	public void setAddress(String line1, String line2, String city, String state, String zipcode) {
		address = new Address(line1, line2, city, state, zipcode);
	}
	
	//Accessor method for personList
	public ArrayList<Person> getAccountList() {
		return personList;
	}
	
	//adds a person to personList
	public void addPerson(Person person) {
		personList.add(person);
	}
	
	//main method for testing
	public static void main(String args[]) {
		
		Person person = new Person("Micheal", "Scott");
		person.setAddress("401 Paper Dr", "503", "Scranton", "PA", "12010");
		Bank bank = new Bank("SEFCU");
		bank.setAddress("401 albany dr", "321", "Albany", "NY", "12252");
		bank.addPerson(person);
		System.out.println(person.getFirstName() + " " + person.getLastName() + " Arrives at " + bank.getName());
		
		person.openCheckingBankAccount(1000);
		System.out.print("Deposit reciept: " + person.getFirstName() + " " + person.getLastName() + ", ");
		person.getAddress().printAddress();
		System.out.println(" Remaining Balance: $" + person.getCheckingBankAccount().getValue());
		
		person.getCheckingBankAccount().deposit(1000.0);
		System.out.print("Deposit reciept: " + person.getFirstName() + " " + person.getLastName() + ", ");
		person.getAddress().printAddress();
		System.out.println(" Remaining Balance: $" + person.getCheckingBankAccount().getValue());
		
		person.getCheckingBankAccount().withraw(500.0);
		System.out.print("Withdrawl reciept: " + person.getFirstName() + " " + person.getLastName() + ", ");
		person.getAddress().printAddress();
		System.out.println(" Remaining Balance: $" + person.getCheckingBankAccount().getValue());
	}
}
