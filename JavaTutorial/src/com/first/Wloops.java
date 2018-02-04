package com.first;

public class Wloops {

	public static void main(String[] args) {

		/*
		 * boolean loop = 15<9; System.out.println(loop);
		 */

		/*
		 * int value = 0; while(value < 10) { System.out.println("Hello---"+value);
		 * value = value + 1; }
		 */
		int x = 5;

		while (x < 10) {
			System.out.println(x);
			if (x == 7) {
				break;
			}
			x++;
		}
	}
}
