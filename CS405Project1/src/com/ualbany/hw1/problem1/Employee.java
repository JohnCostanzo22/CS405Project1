package com.ualbany.hw1.problem1;

/*
 * class to create an employee with a first and last name and a monthly
 * salary
 */
public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	//Constructor that sets firstName, lastName, and monthlySalary fields
	//If monthlySalary argument is less than 0 then monthlySalary is set to 0
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0.0;
		}
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

	//Accessor method for monthlySalary
	public double getMonthlySalary() {
		return monthlySalary;
	}

	//Mutator method for monthlySalary. Does not allow a salary less than 0
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			this.monthlySalary = 0.0;
		}
	}
	
	//raises employee's salary by the percent given
	//Only allows salary to be raised. no negative percent argument allowed
	public void giveRaise(double percent) {
		if(percent > 0) 
			monthlySalary = monthlySalary + (monthlySalary * percent / 100);
	}
	
	//computes the yearlySalary from the monthlySalary
	public double yearlySalary() {
		return monthlySalary * 12;
	}
}
