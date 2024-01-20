package com.example.demo.application;

import java.util.Scanner;

public class CalculateArea {
	public void PrintArea(int side) {
		System.out.println("The area of the square is" + side * side);
	}

	public void PrintArea(int length, int breadth) {
		System.out.println("The area of the Rectangle is" + length * breadth);
	}

	public void PrintArea(double factor, int base, int height) {
		System.out.println("The area of the triangle is" + base * height * factor);
	}

	public void CalculateArea() {

		try (Scanner userIn = new Scanner(System.in)) {
			System.out.println("Enter 1 to calculate area of a square");
			System.out.println("Enter 2 to calculate area of a Rectangle");
			System.out.println("Enter 3 to calculate area of a triangle");
			int inval = userIn.nextInt();
			if (inval == 1) {
				System.out.print("Enter side of the square");
				int side = userIn.nextInt();
				PrintArea(side);
			}

			if (inval == 2) {
				System.out.print("Enter the length of the rectangle");
				int length = userIn.nextInt();
				System.out.print("Enter the breadth of the rectangle");
				int breadth = userIn.nextInt();
				PrintArea(length, breadth);
			}
			if (inval == 3) {
				System.out.print("Enter the height of the triangle");
				int height = userIn.nextInt();
				System.out.print("Enter the base of the triangle");
				int base = userIn.nextInt();
				PrintArea(height, base);
			};
			if (inval >3) {
				System.out.print("invalid input");
			}

		}

	}

}
