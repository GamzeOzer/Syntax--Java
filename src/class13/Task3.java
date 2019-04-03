package class13;

import java.util.Scanner;

public class Task3 {

	
	 public static void main(String[] args) {
		 
		 //Find the middle char
         
	        Scanner scan=new Scanner (System.in);
	        System.out.println( "enter a string");
	        String text= scan.nextLine();
	        int a=text.length();
	        if(!(text.isEmpty())) {
	            if(text.length()%2!=0&&text.length()>3) {
	                
	                System.out.println(text.charAt(text.length()/2));
	                
	            }
	        }
	 }}

