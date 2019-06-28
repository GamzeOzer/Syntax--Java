package class25;


class MasterCard extends Payment{
	
	public void makePayment() {//overriding method
		System.out.println("We can make payment with MC and 2%fee");
	}
}