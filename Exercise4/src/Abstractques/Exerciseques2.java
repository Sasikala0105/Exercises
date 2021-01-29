package Abstractques;
//abstract class bank with abstract method get balance
abstract class Bank{
	abstract void getBalance();
}
//bank a, b,c subclasses of class bank
//having a method name get balance
class BankA extends Bank{
	void getBalance() {
		System.out.println("Deposited in Bank A : $100");
	}
}

class BankB extends Bank{
	void getBalance() {
		System.out.println("Deposited in Bank B : $150");
	}
}

class BankC extends Bank{
	void getBalance() {
		System.out.println("Deposited in Bank C : $200");
	}
}

public class Exerciseques2 {

	public static void main(String[] args) {
		BankA A = new BankA();
		BankB B = new BankB();
		BankC C = new BankC();
		
		A.getBalance();
		B.getBalance();
		C.getBalance();
		
		
	}

}
