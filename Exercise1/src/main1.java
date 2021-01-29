//Write your resume by using Java language that shows off component of biodata, work skills, work experience, talents, programming language results and CGPA calculation.
//Please use a different class and write the method to highlight each component and call these methods into the main method.
public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personal p = new personal(); //create new object for personal class
		resume r = new resume();
		cgpa q = new cgpa();
		exam e = new exam();	
		workExperience w = new workExperience();
		skills s = new skills();
		talent t = new talent();
		
		 System.out.println("My name is " + p.name);
			
		 
		p.printName();
		System.out.println("\t");
		r.printPinfo();
		q.printCGPA();
		e.printExam();
		q.printGPA();
		System.out.println("Final CGPA " +q.calculateCGPA());
		System.out.println("\t");
		w.Workexperience();
		System.out.println("\t");
		s.Skills();
		System.out.println("\t");
		t.Thingsicando();

		
	
	}

}
