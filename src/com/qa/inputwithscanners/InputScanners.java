package com.qa.inputwithscanners;
import java.util.Scanner;
public class InputScanners {
	

	    
public static void main(String[] args) {
	    	try (Scanner scan = new Scanner(System.in)) {
				System.out.println("what's your name?");
				String name = scan.next();
				
////to return name vaviable
//	    	System.out.println(name);
				
 //Int 
				System.out.println("what's your age?");
				int age = scan.nextInt();
				
// //to return age vaviable	
//	    	System.out.println(age);
				
				System.out.println("what's your Job title?");
				String title = scan.next();
				
				System.out.println("Thank you " + name + ", you are a " + age + " year old who's job title is " + title);
			}

	}
	}

