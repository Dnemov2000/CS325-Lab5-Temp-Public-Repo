package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    String name;
	private String address;
    int age;
	
	// constructor that takes only two paras
    /**
 *Constructor For Human 
 *
     * @param name
     * @param age
 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
 *Getter for name 
 *
     * @return 
 */
	public String getName() {
		return name;
	}
	/**
 *Setter for name 
 *
     * @param name
 */
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getAddress() ;
	
	public abstract void setAddress(String address);
	
	/**
 *Getter for Age 
 *
     * @return 
 */
	public int getAge() {
		return age;
	}
	/**
 *Setter for Age 
 *
     * @param age
 */
	public void setAge(int age) {
		this.age = age;
	}
}