/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;
/**
 *
 * @author itlabs
 */
public class Freshman extends Student {
/**
 * constructor for Freshman Class 
 *using data extended from Student Class 
     * @param name
     * @param age
     * @param credits
 */
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }
    @Override
    public void setCredits(int credits) {
        
        //credits for Freshmen must be below 85
        if (credits < 85) {

            super.setCredits(credits);
        }

       else {
        
           throw new IllegalArgumentException("Freshmen must have above below 85 credits");
           
           
            //super.setCredits(credits);
        
        }
    }
/**
 *
 * to string method the outputs the result of Freshman in String format 
 * Freshman: "name" , "AGE" "Credits" , "GPA"
 */    
    @Override
    public String toString(){
        return "Freshman: " + super.getName()+ " Age: " + super.getAge() 
        + " Credits: " + super.getCredits() + " GPA: " + super.getGPA();
    }
}