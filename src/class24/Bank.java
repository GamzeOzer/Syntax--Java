package class24;

public class Bank {
	//parent Class
	
		public int chargeInterest() {
			return 0;
		}
	}
	//1 child class
	class BOA extends Bank{
		@Override//annotation
		public int chargeInterest() {
			return 2;
		}
	}
	//2 child class
	class PNC extends Bank{
		@Override
		public int chargeInterest() {
			return 3;
		}
	}


