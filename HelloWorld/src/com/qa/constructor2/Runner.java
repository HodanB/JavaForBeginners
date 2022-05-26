package com.qa.constructor2;


public class Runner {
	public static void main(String[] args) {
		aboutme myObj = new aboutme();
        myObj.setfirstName("Hodan"); 
        
        System.out.println(myObj.getfirstName());
        
        aboutme myObj1 = new aboutme(" hodan", " barkhad", 140198, 24, 164);
//        myObj1.setlastName("Barkhad"); 
        
        System.out.println(myObj1.getdateOfBirth());
        System.out.println(myObj1);
        
//        myObj.setlastName("smith"); 
//        System.out.println(myObj1.getlastName());

	}
	
}
