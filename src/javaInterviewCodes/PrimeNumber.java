package javaInterviewCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number to check if it is a prime number or not");
		int a=scan.nextInt();
		for (int i=1;i<a;i++) {
			if(a%i==0 && i!=a && i!=1) {
				continue;
			}
			else {
				System.out.println("prime number");
				
			}
				
			}
		}
		
		

	}


