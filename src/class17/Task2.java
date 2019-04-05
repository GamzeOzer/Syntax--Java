package class17;

public class Task2 {

	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.EvenOdd(7);
	}

	void EvenOdd(int number) {
		
		if(number%2==0) {
			System.out.println(number+ " is even");
		}else {
			System.out.println(number+" is odd");
		}
		
	}
}
