package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    // Member Variables
    private int credits;

    // Constructor
    public Freshman(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    public String toString() {
        return "Freshman Student: " + "\nName: " + this.getName() + "\nAge: " + this.getAge() + "\nAddress: "+ this.getAddress() + "\nGPA: " + this.getGPA() + "\nCredits: " + this.credits;
    }
}
