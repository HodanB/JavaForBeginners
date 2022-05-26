package com.qa.Enhanceloops;
import java.util.ArrayList;
import java.util.List;

public class EnhanceForLoops {
	
//Create a method that returns a boolean and accepts an integer as a parameter,
//if the integer is even, return true, if not then return false.

	public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        } 
    } 
	
//Create an array of strings and iterate through it,
//printing each value to console, using an enhanced for loop
	public static void main(String[] args){
	
	  List<String> cities = new ArrayList<>();
	  cities.add("london");
	  cities.add("milan");
	  cities.add("paris");
	  
	  for(String sg : cities) {
	  System.out.println(sg);
	  }
	  System.out.println("---------------------------");
	  
//Create an array of integers 1-20 and iterate through it, 
//using an enhanced for loop, square, and then print each value
	  int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	  for (int number: numbers) {
          System.out.println(number);
//    for (int i = 1; i<= 20; i++) {
//         System.out.println(i);
      }
	  System.out.println("---------------------------");

	  //str => sentence
	  //strArr => words
	  //strTemp => word
	
//Create a method that returns a boolean and accepts an integer as a parameter,
//if the integer is even, return true, if not then return false.
	 
	 
	 System.out.println(isEven(4));
	}
	  
	        
}

	 

