package part1;

public class Exersice1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exersice1 obj =new Exersice1();
		System.out.println(obj.middleChar("emre"));
		
		
		obj.sumOfDigits(25);
		
		System.out.println(obj.isPasswordValid("gmzejdchdd&&&"));
		

	}
	
	String middleChar(String word){
		/*
		 * Write a Java method to display the middle character of a string.Note: 
		 * a) If thelength of the string is odd there will be two middle characters.
		 * b) If the length of the string is even there will be one middle character.
		 * Test Data:Input a string: 350
		 * Expected Output:The middle character in the string: 5
		 */
		if (word.length()%2==0) {
			String middleWord =word.substring(word.length()/2-1, word.length()/2+1);
			return middleWord;
		}else {
			String middleWord =word.substring(word.length()/2, word.length()/2+1);
		return middleWord;
		}
			
	}
	
	
	int sumOfDigits(int number) {
/*
 * Write a Java method to compute the sum of the digits in an integer.
 * Test Data:Input an integer: 25
 * Expected Output:The sum is 7
 */
		
		int sum=0;
		int a=number/10;
		int b=number%10;
		sum=b+a;
		System.out.println(sum);
		
		return sum;
	
	}
	
	boolean isPasswordValid(String password) {
		/*
		 * Write a Java method to check whether a string is a valid password.
		 * Password rules:A password must have at least ten characters.
		 * A password consists of only letters and digits.
		 * A password must contain at least two digits.
		 */
		boolean isvalid=true;
		if(password.length()>=10) {
			if(!password.contains("[^az-AZ-09]")) {
				if(password.contains("[09]")) {
					 isvalid= true;
				}
			}
		}else {
		 isvalid= false;}
		
		
		return isvalid;
		
	}
	
	
	
	
	

}
