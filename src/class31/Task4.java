package class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		
		
		List<Integer> numbers=new ArrayList<Integer>();
		
		for(int i=2;i<=50;i+=2) {
			numbers.add(i);
		
		}
		//for(int i=0;i<numbers.size();i++) {
		// int num=numbers.get(i);
		// if(num%5==0) {
		//	 numbers.remove(i);
		// }
		//}
		
		
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if(num%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
