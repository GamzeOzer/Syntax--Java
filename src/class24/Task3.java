package class24;


/*
 * 3. Create 1 class with a private method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result. (edited) 
 */
public class Task3 {
	
	private void mul(int a,int b) {
		System.out.println(a*b);
	}
	private void mul(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	private void mul(double a,double b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		
		Task3 obj=new Task3();
		obj.mul(3, 4);
		obj.mul(3,4,7);
		obj.mul(3.9, 4.7);
		
	}

}
