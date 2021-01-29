package Exercise2;

public class student1 extends personal {
	String subject;
	char results;
	
	
	student1(){
		
		this.subject="STIA 1113";
	}
	
	student1(char a){
		
		this.results=a;
		
	}
	
	public void printResult() {
		
		System.out.println("\nResult :-");
		
		student1 r = new student1('A');
		System.out.println("Subject: "+subject);
		System.out.println("Result: "+r.results);
	}
	

}
