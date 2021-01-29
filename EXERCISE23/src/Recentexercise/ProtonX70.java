package Recentexercise;
import java.util.Scanner;

public class ProtonX70 extends Proton {
private String windows ;
	
 	//Getter method for radio
    public String getWindow() {
    	return windows;   	
    }
    	
    //Setter method for radio
    public void setWindow(String windows) {
    	this.windows=windows;
  		
	}
	
	public void color() {
		System.out.println("Enter the car color you prefer : ");
    	Scanner in = new Scanner(System.in);
    	String color = in.next(); 
    	System.out.println("This color is not available");
    	
	}
	
	  public void run() {
	    	System.out.println("Proton X70 is running safely.");
	    	System.out.println();
	}
}
