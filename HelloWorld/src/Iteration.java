
public class Iteration {
	 public static void main(String[] args) {
//Not corrrect?       
		 for(int A = 100; A < 200; A++) {
	            if(A == 102) {
	                continue;
	            }
	            if(A == 218) {
	                break;
	            }
	            System.out.println(A);
	        }
//print number till reach threshold/limit      
	       
	       for(int i = 0; i < 10; i++) {
	    	   System.out.println(i);
	       }
	           System.out.println("Hello There!");
//setting a limit	        

	       int n = 5; 
	       for (int i = 1; i <= n; ++i) {
	         System.out.println("it is what it is");
	    }
	       


	}
}