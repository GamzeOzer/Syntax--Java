package class30;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		
        
		
		//generic Array that stores only String Object
		ArrayList<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Jack");
		names.add("Nick");
		names.add("Sam");
		names.add("Mimi");
		//names.add(123); not valid sice wew have eneric arraylist of a type of String
		
		
		
		//non generic ArrayList
		//We dont specify the type that used for objects
		//We can store different types of objects
		ArrayList alist=new ArrayList();
		
		alist.add("String");//String
		alist.add(56);//Integer
		alist.add(546.34);//Double
		alist.add('a');//Character
		
		
		for(Object values:alist) {
			System.out.println(values);
		}
		
		
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		booleanArrayList.add(true);
		
		for(Object val:booleanArrayList) {
			System.out.println(val);
		}


		
	}

}
