
public class skills {
String Itproficiency;
	
	

	skills(){
		this.Itproficiency = " (Microsoft Office Applications, CISCO Packet Tracer, C++ and Mininet)";
		
	}
	skills(String a,String b,String c){
		this.Itproficiency = a;
	}
	
	public void printmyskills() {
		skills one =new skills();
		System.out.println("Skills      : IT Proficiency"+one.Itproficiency+". ");  
		
}
}
