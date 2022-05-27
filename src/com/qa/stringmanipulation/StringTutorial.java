package com.qa.stringmanipulation;

public class StringTutorial {
	public static void main(String args[]) {
        String strLiteral = "Hello World!";
        System.out.println(strLiteral); // output will be: Hello World!
        
//create a String using the new operator: 
        String strObject = new String("Yello World!");
        System.out.println(strObject); // output will be: Yello World!
        
//Creating a String through arrays  
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
         String helloString = new String(helloArray);  
          System.out.println(helloString); // prints out Hello.
//String Length
          String myStr = "I like strings";
          int stringLength = myStr.length();
          System.out.println("String Length is " + stringLength);
          // output will be: String Length is 14
//Concatenating Strings
          String myStr1 = "My cat's name is ".concat("Copy cat");
          System.out.println(myStr1);
          	// output will be: My cat's name is Copy cat
      
        }
	
		
			}
		

