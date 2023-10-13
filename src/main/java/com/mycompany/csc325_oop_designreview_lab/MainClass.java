/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	public static void main(String[] args) {
		// ToDo 5: Fix the error - Check

		// ToDo 6: Fix the constructor of the Student class - Check

		// Todo 7: Create two classes for Freshman and Senior - Check

		// ToDo 8: The senior class should have a minimum of 85 credits - Check

		// ToDo 9: Add a toString method for the Student class - Check
		// ToDo 10: Add a toString method for the Freshman class - Check

		// Create 3 new student classes, 1 freshman and 1 senior using polymorphism
		Student std1= new Student("James", 20);
		// ToDo 11: Add a toString method for the Senior class - Check

		Student std2 = new Freshman("James", 20, 12); // name, age, credits

		Student std3 = new Senior("John", 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student GPA: ");
		double gpa = scanner.nextDouble();
		std1.setGPA(gpa);
		std2.setGPA(gpa);
		std3.setGPA(gpa);Test

		// Print out toString methods and GPAs given by user.
		System.out.println(std1 + "\n");

		System.out.println(std2 + "\n");

		System.out.println(std3 + "\n");

		// ToDo 13: add comments and explain your code - Check

		// ToDo 14: submit using a pull request. - Check
	}
}

