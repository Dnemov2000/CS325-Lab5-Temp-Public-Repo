package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    
      

    
    
    public Student(String name, int age, int credits) {
        super(name, age);
        setCredits(credits);

    }

    private String address;

    private int GPA;

    private int credits;

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }
    

    // ToDo 1: Make this class a child of Human
    // ToDo 2: Fix the resulting errors
    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
}