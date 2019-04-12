package part1;

public class Repl {
	
	
		static String mixString(String s1, String s2)
		{
		  String mixString1="";
		 
	
			for(int i=0;i<s1.length();i++){
			  
			  String str1=String.valueOf(s1.charAt(i));
			  String str2 =String.valueOf(s2.charAt(i));
			 
			    mixString1=str1+str2;
			   
			}
			
			return mixString1;
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
			System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
		}
}