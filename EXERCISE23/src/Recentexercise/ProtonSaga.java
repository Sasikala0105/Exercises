package Recentexercise;
import java.util.Scanner;
//Encapsulation
public class ProtonSaga extends Proton {
	private String fuel;
	private String color;
	
	ProtonSaga(){
		this.color = "color";
	}
		
		
	public void color() {
    	System.out.println("Enter the car color you prefer for availability : ");
    	Scanner in = new Scanner(System.in);
    	String color = in.next();  
    	System.out.println("This color is available for booking");
    	
	 }

	//Getter method for radio
    public String getFuel() {
    	return fuel;   	
    }
    	
    //Setter method for radio
    public void setFuel(String fuel) {
    	this.fuel=fuel;
		
	}
	//Polymorphism
	public void run() {
	    	System.out.println("Proton Saga is running safely.");
	    	System.out.println();
		
		
	}
}
