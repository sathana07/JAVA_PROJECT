package com.example.demo.application;

import java.util.Scanner;

public class RemoveLeadingZeros {
	public void methodRemoveLeadingZeros() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number with leading zeros: ");
		String num = scanner.next();

		System.out.println("Original: " + num);

		// traverse the entire string
		String output = null;
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			// check for the first non-zero character

			if (c != '0') {

				// return the remaining string
				output = num.substring(i);
break;
			}
		}
		System.out.println("Without leading zeros: " + output);
		scanner.close();
	}

}
