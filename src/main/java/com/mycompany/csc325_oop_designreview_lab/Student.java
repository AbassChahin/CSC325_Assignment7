/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human
public class Student extends Human {
    // Member Variables
    private double GPA;

	// ToDo 2: Fix the resulting errors
    // Add constructors
    public Student(String name, int age) {
        super(name, (short) age);
    }

    public Student(String name, int age, int credits) {
        super(name, (short) age);

    }

    // Getters and setters
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter
    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // ToString Method
    public String toString() {
        return "Student:" + "\nName: " + this.getName() + "\nAddress: " + this.address;
    }
	
	// ToDo 4: Add comments to your code
}
