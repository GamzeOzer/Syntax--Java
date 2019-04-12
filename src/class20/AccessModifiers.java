package class20;

public class AccessModifiers {
	private String name="John";
    String name1="Bilal";
    protected String name2="Asha";
    public String name3="Tetiana";
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
	
	/*
	 * Create a method that will take a String and return whether String is palindrome or not. Method should available to all classes within your projects.
	 */

	public boolean isPalindrome(String word) {
		String reverseWord="";
		for(int i=word.length()-1;i>=0;i--) {
			reverseWord=reverseWord+word.charAt(i);
	}
			if(reverseWord.equalsIgnoreCase(word)) {
			return true;
			}else {
				return false;
		}
	}
	
	public boolean isPalindrome1(String word) {
		boolean flag=false;
		String reversed=reverseString(word);
		if(reversed.equalsIgnoreCase(word)) {
			flag=true;
		}
		return flag;
	}
	
	
	/*
	 * Create a method that will take a string and return array of words from that string. Method should be available only within same class.
	 */
	
	private String[] getWordsFromString (String word) {
		String[] words =word.split(" ");
		return words;
	}
	
	
	
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		System.out.println(obj.isPalindrome("kabak"));
		System.out.println(obj.isPalindrome1("kabak"));
		System.out.println(obj.reverseString("Hello"));
		String[] array=obj.getWordsFromString("Have a good day");
		
		for(String word:array) {
			System.out.println(word);
		}
		
		obj.sayHello();
	
	}
	
	void sayHello() {
		
	}

}
