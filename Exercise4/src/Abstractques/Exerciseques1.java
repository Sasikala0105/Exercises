package Abstractques;
//abstract class parent with method message
	abstract class Parent{
		void message() {
		}
	}
		//two subclasses that prints this is first subclass
	//call the method message
	class firstsub extends Parent{
		void message() {
			System.out.println("This is first subclass");
		}
	}
	//two subclasses that prints this is second subclass
	//call the method message
	class secondsub extends Parent{
		void message() {
			System.out.println("This is second subclass");
		}
	}

	public class Exerciseques1 {

		public static void main(String[] args) {
			firstsub obj = new firstsub();
			secondsub obj2 = new secondsub();
			
			obj.message();
			obj2.message();
		}
	}


