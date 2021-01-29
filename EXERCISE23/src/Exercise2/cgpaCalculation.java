package Exercise2;

public class cgpaCalculation {
	int sem;
	double[] gpa = new double[5];
	double sum, finalcgpa;
	
	
	cgpaCalculation() {
		
		this.gpa = new double[] {3.5, 3.2, 3.4, 3.9, 3.6};
			
	
	}
	
	cgpaCalculation(double[] a) {
		
		this.gpa = a;
		
	}
	
	public void printcgpa() {
		
		cgpaCalculation obj1 = new cgpaCalculation();
		System.out.println("Cgpa ");
		
		for(int i=0; i<obj1.gpa.length; i++) {
			
			System.out.println("Sem " +(i+1) +"\t" + obj1.gpa[i]);
			
			sum+=obj1.gpa[i];
			
		}
		finalcgpa= sum/gpa.length;
		System.out.println("Final Cgpa "+finalcgpa);
	}
	
		
	
	}


