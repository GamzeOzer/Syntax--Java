package classReview36_2;
/** Create a class called StringsReview in it
 * Write a program to concatenate or append 'def' to 
 * string 'abc' using
 * StringBuffer and string 'ghi' to the concatenated 
 * string 'abcdef' using
 * String builder.
 */
public class StringsReview {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("abc");
		str.append("def");
		
		System.out.println(str);
		
		StringBuilder str1=new StringBuilder("ghi");
		str1.append("abcdef");
		
		System.out.println(str1);
	}

}
