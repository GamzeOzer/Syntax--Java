package part1;

public class MethodExersice {

	public static void main(String[] args) {
		MethodExersice obj=new MethodExersice();
		obj.smallestValue(34, 45, 90);
		
		obj.avgOfNumbers(2, 4, 6);
		
		obj.numberOfVowels("3ehukoklfvbj78");
		obj.numberOfWord("The quick brown fox jumps over the lazy dog");
	}
	
	
	
	//////////////////////////    1    //////////////////////////////
	
/*
 * Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29 
Expected Output:

The smallest value is 25.0
 */
	
	
	int smallestValue(int a,int b,int c) {
		int smallestnumber=a;
		if(a<b && a<c) {
			smallestnumber=a;
		}else if(b<a&& b<c) {
			smallestnumber=b;
		}else if(c<a && c<b) {
			smallestnumber=c;
		}
		System.out.println(smallestnumber);
		return smallestnumber;
		
	}
	
	
	/////////////////////////   2    ////////////////////////
	
	/*
	 * Write a Java method to compute the average of three numbers. Go to the editor
Test Data:
Input the first number: 25 
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0

	 */
	
	int avgOfNumbers(int a,int b,int c) {
		int avg=(a+b+c)/3;
		System.out.println(avg);
		return avg;
	}
	
	///////////////////////   3 ///////////////////////////
	
	/*
	 * Write a Java method to display the middle character of a string. Go to the editor
Note: a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350 
Expected Output:

                                                                          
The middle character in the string: 5
	 */
	String middleChar(String word){
		
		if (word.length()%2==0) {
			String middleWord =word.substring(word.length()/2-1, word.length()/2+1);
			return middleWord;
		}else {
			String middleWord =word.substring(word.length()/2, word.length()/2+1);
		return middleWord;
		}
	
	
	}
	/////////////////   4 /////////////////////
	
	/*
	 * Write a Java method to count all vowels in a string. Go to the editor
Test Data:
Input the string: w3resource 
Expected Output:

Number of  Vowels in the string: 4

	 */
	
	int numberOfVowels(String str) {
		
		String newstr=str.replaceAll("[^aeiuo]", "");
		int count=newstr.length();
		System.out.println(count);
		return count;
	}
	
	
	////////////////   5   /////////////////////////
	
	/*
	 * Write a Java method to count all words in a string. Go to the editor
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9

	 */
	
	int numberOfWord(String sentence) {
		String[] array=sentence.split(" ");
		System.out.println(array.length);
		return array.length;
	}
	
	
	///////////////   6   ///////////////////////
	
	
	
	
	
}
