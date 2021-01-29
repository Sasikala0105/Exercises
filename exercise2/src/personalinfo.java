

public class personalinfo {
	String name, gender, birthday, citizenship, marital_status, address, phone;
	int age;
	
	
	personalinfo(){
		
		this.gender= "Female";
		this.birthday= "1 May 1998";
		this.age = 22;
		this.citizenship = "Malaysian";
		this.marital_status= "Single";
		this.address= "789-G jalan sungai dua, 11700 gelugor, pulau pinang";
		this.phone = "01133905160";
	}
	
	public personalinfo(String n){
		
		this.name=n;
		
	}
	
	public void printPinfo(){
	
		personalinfo n = new personalinfo("Sasikala Gauthaman");
		
		
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
