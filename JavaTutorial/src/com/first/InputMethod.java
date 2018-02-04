package com.first;

import java.util.Scanner;

public class InputMethod {

	public static void main(String[] args) {
		// Creating Scanner object....
		Scanner input1 = new Scanner(System.in);
		// output of the Prompt...
		System.out.println("Enter a String Value : ");
		// wait for user to enter something...
		String value = input1.nextLine();
		// what you entered....
		System.out.println("You Entered : " + value);
	}
}
