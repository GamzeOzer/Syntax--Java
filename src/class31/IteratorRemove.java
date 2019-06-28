package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {
		//lets create an arraylist of intgers from 1-10
		//remove all odds using iterator
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		
		for(int i=1;i<11;i++) {
			number.add(i);
		}
		
		System.out.println(number.size());
		System.out.println(number);//prints them all in one line
		
		Iterator<Integer> it=number.iterator();
		
		while(it.hasNext()) {
			int num=it.next();
			if(num%2!=0) {
				it.remove();
			}
		}
		
		System.out.println(number);
	}

}
