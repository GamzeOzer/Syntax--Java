package class20;

public class Task3 {
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
	public static void main(String[] args) {
		Task3 obj=new Task3();
		System.out.println(obj.isPalindrome("kabak"));
		
		
	}

}
