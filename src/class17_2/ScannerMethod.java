package class17_2;

import java.util.Scanner;

 public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj=new ScannerMethod();
		
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		
		obj.sub();
		obj.sum(20, 90);
		
		
		obj.sum(x, y);
	
	}
	
	void sum(int a,int b) {//have parameters
		System.out.println(a+b);
		
	}
	
	void sub() {  ////does not have parameters
		int a=10;
		int b=20;
		System.out.println(b-a);
	}
	
	int sum1(int a,int b) {//have parameters
		System.out.println(a+b);
		return a+b;
	}
	

}
