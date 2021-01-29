
public class result {
	String subject;
	char results;
	
	
	result(){
		
		this.subject="STIA 1113";
	}
	
	result(char a){
		
		this.results=a;
		
	}
	
	public void printResult() {
		
		System.out.println("\nResult");
		
		result r = new result('A');
		System.out.println("Subject: "+subject);
		System.out.println("Result: "+r.results);
	}

}
