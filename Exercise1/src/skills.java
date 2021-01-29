
public class skills {
	public void Skills() { 
		String[][] myskills= {
				{"IT Proficiency: ", "Speaking Proficiency: ", "Writing Proficiency: "},
				{"Microsoft Office Applications, CISCO Packet Tracer, C++ and Mininet", 
					"Bahasa Malaysia(excellent),English language(excellent), Tamil language(excellent)", 
					"Bahasa Malaysia(excellent), English language(excellent), Tamil language(moderate)" }
				
		};
		// IT Proficiency : Microsoft Office Applications, CISCO Packet Tracer, C++ and Mininet
		System.out.println(myskills[0][0] + myskills[1][0]);
		// Speaking Proficiency : Bahasa Malaysia(excellent),English language(excellent), Tamil language(excellent)
		System.out.println(myskills[0][1] + myskills[1][1]);
		// Writing Proficiency : Bahasa Malaysia(excellent), English language(excellent), Tamil language(moderate)
		System.out.println(myskills[0][2] + myskills[1][2]);
	}
}
