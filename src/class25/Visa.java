package class25;


	class Visa extends Payment{
		public void makePayment() {//overriding method
			System.out.println("We can make payment with Visa and 1.5%fee");
		}
		
		public void annualFee() {
			System.out.println("Visa card has annual fee");
		}
	}


