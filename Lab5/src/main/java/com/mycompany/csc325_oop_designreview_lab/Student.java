package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    
      

    
 /**
 * Default Constructor 
 *
     * @param name
     * @param age
     * @param credits
 */
    public Student(String name, int age, int credits) {
        super(name, age);
        setCredits(credits);

    }

    private String address;

    private int GPA;

    private int credits;
/**
 *Getter for Address 
 *
     * @return 
 */
    @Override
    public String getAddress() {
        return address;
    }
/**
 *Setter for Address 
 *
     * @param address
 */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
/**
 *Setter for GPA 
 *
     * @param GPA
 */
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
/**
 *Getter for GPA 
 *
     * @return 
 */
    public int getGPA() {
        return GPA;
    }
/**
 *Setter for Credits 
 *
     * @param credits
 */
    public void setCredits(int credits) {
        this.credits = credits;
    }
/**
 *Getter for Credits  
 *
     * @return 
 */
    public int getCredits() {
        return credits;
    }
    

}