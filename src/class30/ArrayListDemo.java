package class30;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <String> greetings=new ArrayList<String>();
		
		greetings.add("hello");//0
		greetings.add("welcome");//1
		greetings.add("hi");//2
		greetings.add("by");//3
		
		
		//getting obj by index
		System.out.println(greetings.get(1));
		
		
		//how many objects we have
		System.out.println(greetings.size());//4

		
		//collections - growable in size 
		greetings.add("how are you");//no error
		System.out.println(greetings.size());//5
		
		greetings.add("how are you");// we can add same value
		greetings.add("how are you");
		
		System.out.println("--------for lopp--------------");
		
		//Getting array
		
		for(int i=0;i<greetings.size();i++) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println("-------advance loop---------------");

		for(String greets:greetings) {
			System.out.println(greets);
		}

	}

}
