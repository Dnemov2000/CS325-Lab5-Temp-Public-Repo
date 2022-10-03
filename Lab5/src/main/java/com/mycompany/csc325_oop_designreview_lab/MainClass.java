/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
      
        
        Freshman std1 = new Freshman("James", 20, 12); // name, age, credits
        Senior std2 = new Senior("John", 30, 90);
        Freshman std3 = new Freshman("John", 30, 90);
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student 1's GPA:");
        std1.setGPA(Integer.parseInt(sc.next()));
                
        System.out.println("Enter Student 2's GPA:");
        std2.setGPA(Integer.parseInt(sc.next()));
        
        System.out.println("Enter Student 3's GPA:");
        std3.setGPA(Integer.parseInt(sc.next()));
        
        System.out.println(std1);

        System.out.println(std2);
        
        System.out.println(std3);

    }

}