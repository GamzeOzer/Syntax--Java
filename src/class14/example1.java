package class14;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		/*int a=10;
		int b=20;
		int sum=a+b;
		a=sum-a;
		System.out.println(a);
		b=sum-b;
		System.out.println(b);*/
		
	
		
		String text1="This is our 1. code meeting 234 ";
		
		
		char[] array= text1.toCharArray();
		for (int i=0;i<array.length;i++) {
			if(array[i]=='1') {
				array[i]='3';
			}else if(array[i]=='3') {
				array[i]='1';
			}
			System.out.print(array[i]);
		}
	
	}}

		

		/*
		text2=text2.replaceAll(text2, text1);
		System.out.println(text2);
		
		text1=text2.replaceAll(text2, text1);
		System.out.println(text1);*/
		
		
		