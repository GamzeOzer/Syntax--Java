package class31;

import java.util.ArrayList;
import java.util.Iterator;



public class Recap {

	public static void main(String[] args) {
		
		//int a=10;
		//int b=20;
		
		//int [] array= {10,20,30,40};
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);  ///comes from collection
		numbers.add(0,13);  ///specific to all List objects
		numbers.add(0, 14);
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		
		
		//1.way using for loop
		
		System.out.println("------------usig for loop ---------------");
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		//2.way using for loop
		
		System.out.println("------------usig advanced for loop ---------------");
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		//3.way using for loop
		
		System.out.println("------------usig Iterator---------------");
		
		Iterator<Integer> iter=numbers.iterator();
		//hasNext();, next();, remove();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//4.way using for loop
		/*
		 * kodun, veri yapısının iç tasarımı bilgisine ihtiyaç duymadan belirli bir arayüz sayesinde elemanlar
		 *  üzerinde gezinebilmesini sağlayan yapısal bir tasarım motifi 
		 */
		System.out.println("------------usig while loop ---------------");
		int i=0;
		while(i<numbers.size()) {
			System.out.println(numbers.get(i));
			i++;
		}
		
		
	}

}
