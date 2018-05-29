package com.ualbany.hw1.problem2;

import java.util.Scanner;

/*
 * Test class for HW1Problem2 methods
 */
public class Problem2Driver {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int first, second, remainder, heads;
		double x1, y1, x2, y2;
		
		//get two integers for testing multiple method
		System.out.print("Enter two integers seperated by a space: ");
		//Handle all unexpected input and if bad input is given skips to flipACoin test
		try {
			first = scanner.nextInt();
			second = scanner.nextInt();
			System.out.println("multiple method results: " + HW1Problem2.multiple(first, second));

			//get an int for testing of remainder method
			System.out.print("Enter an integer: ");
			remainder = scanner.nextInt();
			System.out.println("remainder method results: " + HW1Problem2.remainder(remainder));
		
			//get four doubles for testing of distance method
			System.out.print("Enter four doubles each seperated by a space x1 y1 x2 y2: ");
			x1 = scanner.nextDouble();
			y1 = scanner.nextDouble();
			x2 = scanner.nextDouble();
			y2 = scanner.nextDouble();
			System.out.println("distance method results: " + HW1Problem2.distance(x1, y1, x2, y2));
		
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
		
		//test flipACoin method
		heads = HW1Problem2.flipACoin();
		System.out.println("flipACoin method results: " + heads + " heads and " + (10 - heads) + " tails");
		scanner.close();
	}

}
