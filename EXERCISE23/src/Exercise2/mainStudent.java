package Exercise2;
import java.util.Scanner;

public class mainStudent {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Sasikala, what can i do for you?");
		String showE1and2 = scan.next();
		System.out.println("\t");
		student1 s1 = new student1();
	
		cgpaCalculation obj1 = new cgpaCalculation();
		s1.printPinfo();
		System.out.println("\t");
		obj1.printcgpa();
		System.out.println("\t");
		s1.printResult();
		
		System.out.println("\t");
		
		student2 s2 = new student2();
		System.out.println("\t");
		System.out.println("My skills :-");
		s2.printmyskills();
		
		System.out.println("\t");
		
		student3 s3 = new student3();
		System.out.println("My working experience :-");
		s3.printworkexperience();
	}

}
