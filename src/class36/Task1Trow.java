package class36;

public class Task1Trow {
	// create an exception: when user it trying to withdraw larger amount that the balance
    //throw an exception saying “You do not have enough money”

	static double balance=3000;
	public static void main(String[] args) {
		
		withdraw(500);
		
		withdraw(5000);
		
	}
	
	public static void withdraw(int amaunt) {
		if(amaunt<balance) {
			System.out.println("Please take your money");
		}else {
			throw new ArithmeticException("You dont have enough money");
		}
	}

}
