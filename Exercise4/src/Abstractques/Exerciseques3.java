package Abstractques;
//create abstract class marks with method getpercentage
abstract class Marks {
    abstract double getPercentage();
}
//inherit by two other classes a and b
//calculate the percentage of marks obtain in 3 subj out of 100
class A extends Marks{
    double subject1 , subject2, subject3;
    
    A (double s1, double s2, double s3) {
       this.subject1 = s1;
       this.subject2 = s2;
       this.subject3 = s3;
    }
    
    double getPercentage() {
    	double percentageofstudent;
    	percentageofstudent = (subject1 + subject2 + subject3) / 300 * 100;
    	System.out.println("Student A overall percentage in 3 subjects : " +percentageofstudent + " %");
	return percentageofstudent;
	
    }
}
//calculate the percentage of marks obtain in 4 subj out of 100
//inherit by two other classes a and b having a method with same name
class B extends Marks{
    double subject1, subject2, subject3, subject4;

    B (double s1, double s2, double s3, double s4) {
    	this.subject1 = s1;
    	this.subject2 = s2;
    	this.subject3 = s3;
    	this.subject4 = s4;
    }
    
    double getPercentage() {
    	double percentageofstudent;
	percentageofstudent = (subject1 + subject2 + subject3 + subject4) / 400 * 100;
	System.out.println("Student B overall percentage in 4 subjects : " +percentageofstudent + " %");
	return percentageofstudent;
    }
}

public class Exerciseques3{
	
    public static void main(String[] args) {
        
        A A = new A(80,85,60);
        B B = new B(78,66,100,93);
        
        A.getPercentage();
        B.getPercentage();        
    }
    


}
