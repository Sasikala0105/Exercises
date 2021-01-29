package Exercise2;

public class personal {
	
	String personal_info, name, age, gender, birthday, citizenship, marital_status, address, phone;
	
	
	personal(){
		
		this.personal_info ="My personal information";
		this.gender= "Female";
		this.birthday= "1 May 1998";
		this.age = "22 years old";
		this.citizenship = "Malaysian";
		this.marital_status= "Single";
		this.address= "789-G Jalan Sungai Dua, 11700 Gelugor, Pulau Pinang.";
		this.phone = "011-33905160";
	}
	
	public personal(String n){
		
		this.name=n;
		
	}
	
	public void printPinfo(){
	
		personal n = new personal("Sasikala Gauthaman");
		
		System.out.println("My personal information");
		System.out.println("\nName: "+n.name);
		System.out.println("Gender: "+gender);
		System.out.println("Date of Birth: "+birthday);
		System.out.println("Age: "+age);
		System.out.println("Citizenship: "+citizenship);
		System.out.println("Marital Status: "+marital_status);
		System.out.println("Address: "+address);
		System.out.println("No phone: "+phone);
	}
	
}
