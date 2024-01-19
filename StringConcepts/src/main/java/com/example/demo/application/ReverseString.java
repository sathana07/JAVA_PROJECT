package com.example.demo.application;

import java.util.Scanner;

public class ReverseString {
	public void methodReversestring() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userInput = scanner.nextLine();
		String reversed;
		reversed = new StringBuilder(userInput).reverse().toString();

		System.out.println("Original: " + userInput);
		System.out.println("Reversed: " + reversed);

		scanner.close();
	}

}
