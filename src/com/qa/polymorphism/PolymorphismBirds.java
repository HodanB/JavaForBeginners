package com.qa.polymorphism;


class Bird {
	public void sing () {
	System.out.println("Birds normall sing like this tweet tweet tweet");
}
}
class Pigeon extends Bird{
	public void sing () {
		System.out.println("But pigeons sing like this tweet Oi you tweet ");
	}
}

class Crow extends Bird { 
	 public void sing() {
		    System.out.println("Crows sing like this QAAA");
}
}

 class PolymorphismBirds {
	public static void main(String[] args) {
		// Create a Animal object 
		Bird myBird = new Bird();  
		// Create a Pigeon object
			   Bird myPigeon = new Pigeon(); 
		// Create a Crow object
			   Bird myCrow = new Crow();  
		// Create a Dog object
			    myBird.sing();
			    myPigeon.sing();
			    myCrow.sing();
			  }
	 }
