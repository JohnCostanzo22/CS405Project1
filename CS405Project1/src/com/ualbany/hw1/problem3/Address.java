package com.ualbany.hw1.problem3;

/*
 * Class that stores an address consisting of line1, line2
 * city, state, and zipcode. There are no setter methods. Any
 * changes to a person's address will require a new Address object
 */
public class Address {

	private String line1, line2, city, state, zipcode;

	//Constructor method that sets all fields
	public Address(String line1, String line2, String city, String state, String zipcode) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	//Accessor method for line1
	public String getLine1() {
		return line1;
	}

	//Accessor method for line2
	public String getLine2() {
		return line2;
	}

	//Accessor method for city
	public String getCity() {
		return city;
	}

	//Accessor method for state
	public String getState() {
		return state;
	}

	//Accessor method for zipcode
	public String getZipcode() {
		return zipcode;
	}
	
	//prints out all of the elements of an Address
	public void printAddress() {
		if(line1 != null && line2 != null && city != null && state != null && zipcode != null)
			System.out.print(line1 + " " + line2 + ", " + city + " " + state + ", " + zipcode);
	}
}
