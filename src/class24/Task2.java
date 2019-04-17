package class24;

/*
 * 2. Create 1 class with a static method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.
 */

public class Task2 {
	
	public static void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void addition(double a, double b) {
		System.out.println(a+b);
	}
	public static void addition(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
public static void main(String[] args) {
	
	addition(5,6);
	addition(5.5,6.3);
	addition(5,6,8);
	
	
	
}



}
