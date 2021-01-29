

public class resume {

	
		String personal_info, name, age, gender, birthday, citizenship, marital_status, address, phone;
		
		
		resume(){
			
			this.personal_info ="My personal information";
			this.gender= "Female";
			this.birthday= "1 May 1998";
			this.age = "22 years old";
			this.citizenship = "Malaysian";
			this.marital_status= "Single";
			this.address= "789-G Jalan Sungai Dua, 11700 Gelugor, Pulau Pinang.";
			this.phone = "011-33905160";
		}
		
		public resume(String n){
			
			this.name=n;
			
		}
		
		public void printPinfo(){
		
			resume r = new resume("Sasikala Gauthaman");
			
			System.out.println("My personal information");
			System.out.println("\nName: "+ r.name);
			System.out.println("Gender: "+gender);
			System.out.println("Date of Birth: "+birthday);
			System.out.println("Age: "+age);
			System.out.println("Citizenship: "+citizenship);
			System.out.println("Marital Status: "+marital_status);
			System.out.println("Address: "+address);
			System.out.println("No phone: "+phone);
		

		
		String Name = "Sasikala";
		
		System.out.println("Your name has " + Name.length() + " characters.");
		
		System.out.println("\t");
		
		double cgpa = displayCGPA(3.45, 3.67);
		System.out.println("CGPA = " + cgpa);
		
		double cgpa2 = displayCGPA(2.50, 3.80);
		System.out.println("CGPA2 = " + cgpa2);
		
		System.out.println("\t");
		
		
	}
public static void Gender() {
	System.out.println("Gender : Female");
	
}
public static void Age() {
	System.out.println("Age : 22");
	
}
static double displayCGPA(double a, double b) {
	double sum = (a + b)/2;
	return sum;
	
	
	
	}

}
