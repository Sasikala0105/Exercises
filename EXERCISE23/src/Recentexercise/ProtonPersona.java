package Recentexercise;
import java.util.Scanner;
//Encapsulation
public class ProtonPersona extends Proton {
	
	private String bigBoot; //private data member
	private String radio;   //private data member
	private String color; //private data member
	private String key = "Remote";
	
	
	
	ProtonPersona() {
		
		System.out.println("Please enter boot space: ");
		Scanner in = new Scanner(System.in);
		String boot = in.next();
					
				this.bigBoot=boot;
				this.color = "color";
		
	}
	
    public void boot() {
    	System.out.println("- Bigger boot space\n" + bigBoot);
    	
    }
    
    public void color() {
    	System.out.println("Enter the car color you prefer for availability : ");
    	Scanner in = new Scanner(System.in);
    	String color = in.next();  
    	System.out.println("This color is available for booking");
    	
    }
    	
    //Getter method for radio
    public String getRadio() {
    	return radio;   	
    }
    	
    //Setter method for radio
    public void setRadio(String radio) {
    	this.radio=radio;
    }
    
  //getter method for key
  	public String getKey() {
  		return key;
 
    }
    //Polymorphism
    public void run() {
    	System.out.println("Proton Persona is running safely.");
    	System.out.println();
    }
}
