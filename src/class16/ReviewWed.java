package class16;

import java.util.Scanner;

public class ReviewWed {
	
	
	///global variables---- outside of main method
	String eyes;
	String hair;
	String nose;
	String shirt;

	

	public static void main(String[] args) {
		
		////local variables----inside of main method
		
		
		ReviewWed wegas=new ReviewWed();
		
		wegas.eyes="blue";
		wegas.hair="blue";
		wegas.nose="brown";
		wegas.shirt="gray";
		wegas.humanEyes();
		wegas.noReturn();
		
		
		
		
		wegas.scannerFirstName();
		wegas.noReturn();
		wegas.scannerInt();
		
		
		wegas.reverseString();
		
		wegas.vowelCountWithLoop();
		
		wegas.vowelCountWithReplaceAll();
	}
	
	void humanEyes() {
		ReviewWed weqas=new ReviewWed();
		weqas.eyes="red";
		System.out.println(weqas.eyes);
	}
	void noReturn() {
		System.out.println("I do not have a return type");
	}
	
	
	void scannerFirstName() {
		Scanner scan =new Scanner(System.in);
		scan.nextLine();
	}
	void scannerInt() {
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
	}

	
	 void reverseString() {
		String str="Gamze";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.print(reverse);
	}
	
	void vowelCountWithLoop() {
		String wegas="hello world my name Is wEqas";
		
		char[]w =wegas.toCharArray();
		char empty;
		for(int i=0;i<=w.length-1;i++) {
			if(w[i]=='a' || w[i]=='A' || w[i]=='e' || w[i]=='E'||w[i]=='i'|| w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
				empty=w[i];
				System.out.print(empty +", ");
			}
		}
	}
	
	void vowelCountWithReplaceAll() {
		String wegas="hello world my name Is wEqas";
		String replace=wegas.replaceAll("[^aA,eE,iI,oO,uU]", "");
		System.out.println(replace);
	}
}
