
public class AccessModifiers {
//5 attributes, 3 constructors, getters and setters for all of them (write out at least 2 of them without generating)
	private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int age;
    private int height;
// constructors
    public AccessModifiers() {}
    public AccessModifiers(String firstName, String lastName, int dateOfBirth, int age, int height) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.dateOfBirth = dateOfBirth;
    	this.age = age;
    	this.height = height;
    	
    }

//Getters and Setters
	
    public String getfirstName() {
        return firstName;
    }
 	public void setfirstName(String firstName) {
        this.firstName = firstName;
 	}
 	public String getlastName() {
        return lastName;
    }
 	public void setlastName(String lastName) {
        this.lastName = lastName;
 	} 
 	public int getdateOfBirth() {
        return dateOfBirth;
    }
    public void setdateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public int getage() {
        return age;
    }
    public void setage(int age) {
        this.age = age;
    }
    public int getheight() {
        return height;
    }
    public void setheight(int height) {
        this.height = height;
    }
//right click - source - generate toString
	@Override
	public String toString() {
		return "My first Name is " + firstName + ". My last Name is " + lastName + ". My date Of Birth is " + dateOfBirth
				+ ", my age is " + age + ", and my height is " + height + ".";
	}
    
//// Set the value of the firstname variable to "Hodan"
//    
//    public static void main(String[] args) {
//        AccessModifiers myObj = new AccessModifiers();
//        myObj.setfirstName("Hodan"); 
//        
//        System.out.println(myObj.getfirstName());
//}
//// Set the value of the lastName variable to "Barkhad"
//    public static void main1(String[] args) {
//        AccessModifiers myObj = new AccessModifiers();
//        myObj.setlastName("Barkhad"); 
//        
//        System.out.println(myObj.getlastName());
}

