package com.ualbany.hw1.problem2;

import java.util.Random;

/*
 * Class of 4 static methods that do a particular calculation or simulation
 */
public class HW1Problem2 {

	//Calculates if first is fully divisible (no remainder)
	//by second and returns true if it fully divisible is and false if not
	public static boolean multiple(int first, int second) {
		if(first % second == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//Returns the remainder of number/7
	public static int remainder(int number) {
		return number % 7;
	}
	
	//Calculates the distance between the two points in (x1,y1) (x2,y2) form
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
	
	//method to simulate flipping a coin 10 times
	//returns number of heads out of 10 flips
	public static int flipACoin() {
		int heads = 0;
		Random random = new Random();
		int temp;
		for(int i = 0; i < 10; i++) {
			//random number 1 - 100
			temp = random.nextInt(100) + 1;
			//if the random int is even then its a heads
			if(temp % 2 == 0)
				heads++;
		}
		return heads;
	}
	
}
