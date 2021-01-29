
public class workExperience {
	int num;
	String workexperience;
	String place;
	
	workExperience(){
		this.num=1;
		this.workexperience="Waitress and kitchen helper";
		this.place="Hui shang ying Restaurant";
		
	}
	
	workExperience(int a,String b,String c){
		this.num = a;
		this.workexperience = b;
		this.place = c;
	}
	
	public void printworkexperience() {
		workExperience one =new workExperience();
		workExperience two =new workExperience (2,"Bus Marshall","POWIIS International School");
		System.out.println("Work experience      :"+one.num+". "+one.workexperience+" at "+one.place);  
		System.out.println("                      "+two.num+". "+two.workexperience+" at "+two.place);  
		
		
	
}
}
