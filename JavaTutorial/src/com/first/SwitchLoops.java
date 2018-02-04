package com.first;

import java.util.Scanner;

public class SwitchLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Command : ");
		String text = input.nextLine();
		
		switch (text) {
		case "Start":
			System.out.println("Machine Started...");
			break;
		case "Stop":
			System.out.println("Machine Stoped...");
			break;
		default:
			System.out.println("Command Not Recognized...");
		}
	}

}
