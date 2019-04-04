package class16;

public class ReviewWed {
	
	
	///global variables---- outside of main method

	public static void main(String[] args) {
		
		////local variables----inside of main method
		
		
		ReviewWed rew=new ReviewWed();
		rew.reverseString();
		
		rew.vowelCountWithLoop();
		
		rew.vowelCountWithReplaceAll();
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
