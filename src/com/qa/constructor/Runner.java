package com.qa.constructor;

public class Runner {
	public static void main(String[] args) {
		Moterbike myObj = new Moterbike();
        myObj.setName("MV Agusta F4CC"); 
        System.out.println(myObj.getName());
        
        Moterbike myObj1 = new Moterbike("F4CC", "MV Agusta", 200 , 2007);
        System.out.println(myObj1);
}
//		// create an empty object using the default constructor
//		Moterbike myMoterbike = new Moterbike();
////	create an object using everything constructor
//		myMoterbike.setName("MV Agusta F4CC");
//		System.out.println(myMoterbike);
//  
//    
//    Moterbike myNewMoterbike = new Motrbike("Moto Guzzi V7");
//    System.out.println(myNewMoterbike);
//    
//    Moterbike myDreamMoterbike = new Moterbike("-");
//    System.out.println(myDreamMoterbike);

	}


