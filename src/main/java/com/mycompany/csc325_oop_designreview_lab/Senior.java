package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    // Member Variables
    private int credits;

    // Constructor
    public Senior(String name, int age, int credits) {
        super(name, age);

        // Check if credits are below 85
        if (credits < 85) {
            throw new IllegalArgumentException("Credits must be 85 or higher for a Senior. Redirecting to Freshman...");
        }

        else {
            this.credits = credits;
        }
    }

    public String toString() {
        return "Senior Student: " + "\nName: " + this.getName() + "\nAge: " + this.getAge() + "\nAddress: "+ this.getAddress() + "\nGPA: " + this.getGPA() + "\nCredits: " + this.credits;
    }
}
