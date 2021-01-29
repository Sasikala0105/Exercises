package Exercise2;

public class student3 extends student2 {

	int num;
	String workexperience;
	String place;
	
	student3(){
		this.num=1;
		this.workexperience="Waitress and kitchen helper";
		this.place="Hui shang ying Restaurant";
		
	}
	
	student3(int a,String b,String c){
		this.num = a;
		this.workexperience = b;
		this.place = c;
	}
	
	public void printworkexperience() {
		student3 one =new student3();
		student3 two =new student3 (2,"Bus Marshall","POWIIS International School");
		System.out.println(""+one.num+". "+one.workexperience+" at "+one.place);  
		System.out.println(""+two.num+". "+two.workexperience+" at "+two.place);  
		
	}

}
