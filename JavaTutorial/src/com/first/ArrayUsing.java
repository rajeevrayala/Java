package com.first;

public class ArrayUsing {

	public static void main(String[] args) {

		int[] values;
		values = new int[3];

		values[0] = 0;
		values[1] = 1;
		values[2] = 2;

		/*
		 * System.out.println(values[0]); System.out.println(values[1]);
		 * System.out.println(values[2]);
		 */

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		int[] numbers = { 5, 6, 7, 8 };
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
	}

}
