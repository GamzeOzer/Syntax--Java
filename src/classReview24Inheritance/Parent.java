package classReview24Inheritance;

/*
 * Task 2
Create a new package with name of inheritance. Then create a class called Parent. In Parent class create a constructor and have it print “i am from Parent Class” then Create a Child Class
And then Create a constructor and have it print "I am from Child Class".
Extend Parent to Child Class and then create an object of child class in main method in child class.
Then see your output.
 */


/*
 * Task: Create Methods in your Parent Class, one method i want you to return 
 * a reverse method for a string with one parameter. Then create a second 
 * method same name as the reverse string but taking two string parameters. 
 * For method taking two parameters reverse(one, two Output should be eonwot
 */


/*
 * Task: Create Methods in your Parent Class, one method i want you to 
 * return a reverse method for a string with one parameter. Then create 
 * a second method same name as the reverse string but taking two string
 *  parameters. For method taking two parameters reverse(one, two)
    Output should be eonwot make sure both strings are equal in length!!!
 */



/*
 * ask: Create a boolean method that takes 2 boolean parameters of boolean
(true,true) print false
(false,true) print true
(true,false) print false
(false,false) print true
 */
public class Parent {
	Parent(){
		System.out.println("i am from Parent Class");
	}
	
	String Reverse(String str) {
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}
	
	String Reverse(String str1,String str2) {
		String reverse="";
		if (str1.length()==str2.length()) {
			for(int i=str1.length()-1;i>=0;i--) {
				reverse=reverse+str1.charAt(i)+str2.charAt(i);
			}
		}
		return reverse;
		
	}
	
	boolean checkBoolean(boolean x,boolean y) {
		boolean result=false;
		
		if(x==true && y==true) {
			result=false;
		}else if(x==false && y==true) {
			result=true;
		}else if(x==true && y==false) {
			result=false;
		}else if(x==false && y==false) {
				result=true;}
			
		
		return result;
	}

}
