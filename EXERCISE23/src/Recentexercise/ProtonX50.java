package Recentexercise;
import java.util.Scanner;

public class ProtonX50 extends ProtonX70 {
	private String park;
	private String color;
	

	ProtonX50(){
		this.color = "color";

	}
	public void color() {
	
		System.out.println("Enter the car color you prefer : ");
    	Scanner in = new Scanner(System.in);
    	String color = in.next();  
    	System.out.println("This color is unavailable.");
    	
    	
    	System.out.println("Choose another color : ");
    	Scanner in1 = new Scanner(System.in);
    	String color1 = in.next();  
    	System.out.println("It is available and limited color.");
    	
	}
	
	//Getter method for radio
    public String getPark() {
    	return park;   	
    }
    	
    //Setter method for radio
    public void setPark(String parking) {
    	this.park = parking;  	
	
	}
	
	
	  public void run() {
	    	System.out.println("Proton X50 is running safely.");
	    	System.out.println();
		    	
		
	}
	
}
