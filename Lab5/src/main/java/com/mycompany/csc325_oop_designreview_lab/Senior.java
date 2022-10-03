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
public class Senior extends Student {

    public Senior(String name, int age, int credits) {
        super(name, age, credits);

        setCredits(credits);
    }
/**
 * Takes credits and prompts if it is larger than 84 credits 
 * 
 * 
 * 
     * @param credits
 */  
    @Override
    public void setCredits(int credits) {
        
        //credits for seniors must be above 85
        if (credits > 84) {

            super.setCredits(credits);
        }

      
         else {
              throw new IllegalArgumentException("Seniors must have above 85 credits");
           

        }
    }
/**
 *
 * to string method the outputs the result of Freshman in String format 
 * Freshman: "name" , "AGE" "Credits" , "GPA"
 */  
    @Override
    public String toString() {
        return "Senior: "
                + super.getName()
                + " Age: " + super.getAge()
                + " Credits: " + super.getCredits()
                + " GPA: " + super.getGPA();
    }

}