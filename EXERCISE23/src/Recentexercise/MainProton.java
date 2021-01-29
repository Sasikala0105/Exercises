package Recentexercise;

public class MainProton {

	public static void main(String[] args) {
		ProtonSaga s = new ProtonSaga();
		System.out.println("Proton Saga features :- ");
		s.printProton();
		s.sum(30000,40000);
		s.color();
		//ENCAPSULATION
		s.setFuel("Efficiency");
		System.out.println("Fuel consumption : "+s.getFuel());
		s.run();
		
		
		System.out.println("\t");
		
		
		ProtonPersona p = new ProtonPersona();
		System.out.println("\nProton Persona features :- ");
		p.boot();
		p.color();
		//ENCAPSULATION 
		p.setRadio("Panasonic");
		System.out.print("Radio Brand         : "+p.getRadio()+"\n");
		p.getKey();
		System.out.println("Key type            : "+p.getKey());
		p.run();
		
		
		System.out.println("\t");
		
		
		ProtonX70 p1 = new ProtonX70();
		System.out.println("Proton X70 features :- ");
		//ENCAPSULATION
		p1.setWindow("Half-tinted");
		System.out.println("Windows type      : "+p1.getWindow());
		p1.printProton();
		p1.color();
		p1.run();
		
		
		System.out.println("\t");
		
		
		ProtonX50 p2 = new ProtonX50();
		System.out.println("Proton X50 features :- ");
		//ENCAPSULATION
		//ENCAPSULATION
		p2.setPark("Auto-parking");
		System.out.println("Parking Features : "+p2.getPark());
		p2.printProton();
		
		p2.color();
		p2.run();
		
		
		

	}

}
