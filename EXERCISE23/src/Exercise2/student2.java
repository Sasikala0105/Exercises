package Exercise2;

public class student2 extends personal {
	
	String Itproficiency;
	String Speakingproficiency;
	String Writingproficiency;
	
	student2(){
		this.Itproficiency = " (Microsoft Office Applications, CISCO Packet Tracer, C++ and Mininet)";
		this.Speakingproficiency = " Bahasa Malaysia(excellent),English language(excellent), Tamil language(excellent)";
		this.Writingproficiency =" Bahasa Malaysia(excellent), English language(excellent), Tamil language(moderate)";
		
	}
	student2(String a,String b,String c){
		this.Itproficiency = a;
		this.Speakingproficiency = b;
		this.Writingproficiency = c;
	}
	
	public void printmyskills() {
		student3 one =new student3();
		System.out.println("1.IT Proficiency"+one.Itproficiency+". ");  
		System.out.println("2.Speaking Proficiency"+one.Speakingproficiency+".");
		System.out.println("3.Writing Proficiency"+one.Writingproficiency+".");
		
}

}
