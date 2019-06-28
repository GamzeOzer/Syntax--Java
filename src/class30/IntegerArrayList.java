package class30;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		
		//ArrayList<int> numbers =new ArrayList<int>();  gives error cause it shoul be object
		
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);

		
		//I want to change the value
		
		numbers.set(2, 300);//we change the value 30 to 300
	
		
		for(Integer num: numbers) {//int is ok too
			System.out.println(num);
		}
	}

}
