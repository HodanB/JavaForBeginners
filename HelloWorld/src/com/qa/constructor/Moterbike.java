package com.qa.constructor;

public class Moterbike {
	
	private String name;
    private String make;
    private int horsePower;
    private int year;
 //Default constructor
    public Moterbike() {}

//Everything constructor - constructors shouldn't be the same
		public Moterbike (String name, String make, int horsePower, int year) {
			this.name = name;
			this.make = make;
			this.horsePower = horsePower; 
			this.year = year;
		}
		
//Getters and Setters
		
	 	public String getName() {
	        return name;
	    }
	 	public void setName(String name) {
	        this.name = name;
	    }
	 	public String make() {
	        return make;
	    }
	    public void setMake(String make) {
	        this.make = make;
	    }
	    public int gethorsePower() {
	        return horsePower;
	    }
	    public void sethorsePower(int horsePower) {
	        this.horsePower = horsePower;
	    }
	    public int getyear() {
	        return year;
	    }
	    public void setyear(int year) {
	    	this.year = year; 
	    }
//right click - source - generate toString
	    @Override
		public String toString() {
			return "My Moterbike name is " + name + ", it's make is " + make + " with the horsePower of " + horsePower + ". It was made in " + year + ".";
		}
	    
	 
//Constructors cannot have the same data type layout
		public Moterbike(int year, String make) {
			this.year = year;
			this.make = make;
		}

//This is allowed, because the order of the data types is different
		public Moterbike(String make, int year) {
			this.make = make;
			this.year = year;
	}
		
	
	 }
