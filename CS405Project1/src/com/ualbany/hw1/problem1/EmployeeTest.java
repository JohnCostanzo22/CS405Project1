package com.ualbany.hw1.problem1;

/*
 * Class to test Employee class
 */
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Tom","Brady",1000);
		Employee employee2 = new Employee("David", "Oritz", -100);
		
		//print out both employee's info
		System.out.println("Employee: " + employee1.getFirstName() + " " + employee1.getLastName() + ", Salary: " +  employee1.yearlySalary());
		System.out.println("Employee: " + employee2.getFirstName() + " " + employee2.getLastName() + " Salary: " +  employee2.yearlySalary());

		//set employee2 salary to a positive number test raise
		employee2.setMonthlySalary(300.0);
		
		employee1.giveRaise(10.0);
		employee2.giveRaise(10.0);
		
		//print out employee's info after raise
		System.out.println("Employee: " + employee1.getFirstName() + " " + employee1.getLastName() + ", Salary: " +  employee1.yearlySalary());
		System.out.println("Employee: " + employee2.getFirstName() + " " + employee2.getLastName() + ", Salary: " +  employee2.yearlySalary());

	}

}
