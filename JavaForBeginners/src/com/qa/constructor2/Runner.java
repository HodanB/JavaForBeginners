package com.qa.constructor2;


public class Runner {
	public static void main(String[] args) {
		AboutMe myObj = new AboutMe();
        myObj.setfirstName("Hodan"); 
        
        System.out.println(myObj.getfirstName());
        
        AboutMe myObj1 = new AboutMe(" hodan", " barkhad", 140198, 24, 164);
//        myObj1.setlastName("Barkhad"); 
        
        System.out.println(myObj1.getdateOfBirth());
        System.out.println(myObj1);
        
//        myObj.setlastName("smith"); 
//        System.out.println(myObj1.getlastName());

	}
	
}
