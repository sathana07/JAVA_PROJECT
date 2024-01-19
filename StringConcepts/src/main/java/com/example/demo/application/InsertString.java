package com.example.demo.application;

import java.util.Scanner;

public class InsertString {
	public void methodInsertString() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a originalString: ");
		String originalString = scanner.nextLine();
		System.out.print("Enter the string to insert: ");
		String stringToInsert = scanner.nextLine();
		System.out.println("Original String: " + originalString);
		System.out.print("Enter the index to insert at: ");
        int insertIndex = scanner.nextInt();
		scanner.close();
	}

}
