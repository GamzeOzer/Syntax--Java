package class20;

public class task2 { 
	/*
       Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
	 */
	
	String reverseString(String word) {
		String reverseWord="";
		for(int i=word.length()-1;i>=0;i--) {
			reverseWord=reverseWord+word.charAt(i);
		}
		return reverseWord;
	}

	public static void main(String[] args) {
		task2 obj=new task2();
		System.out.println(obj.reverseString("word"));
		
	}

}
