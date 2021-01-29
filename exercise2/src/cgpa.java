

public class cgpa {
	int sem;
	double[] gpa = new double[5];
	double sum, finalcgpa;
	
	
	cgpa() {
		
		this.gpa = new double[] {3.0, 3.2, 3.4, 3.9};
			
	
	}
	
	cgpa(double[] a) {
		
		this.gpa = a;
		
	}
	
	public void printcgpa() {
		
		cgpa obj1 = new cgpa();
		System.out.println("Gpa               :");
		
		
		for(int i=0; i<obj1.gpa.length; i++) {
			
			System.out.println("                  : Sem " +(i+1) +"\t" + obj1.gpa[i]);
			
			sum+=obj1.gpa[i];
			
		}
		finalcgpa=sum/5;
	
	}
	
}
