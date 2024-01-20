package com.example.demo.application;

import java.util.Scanner;

public class CompareString {

	public void methodCompareString() {
		try (Scanner Scanner = new Scanner(System.in)) {
			System.out.println("Enter first string: ");
			String var1 = Scanner.nextLine();

			System.out.println("Enter second string: ");
			String var2 = Scanner.nextLine();

			if (var1.equals(var2)) {
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");

			}
		}

	}

}
