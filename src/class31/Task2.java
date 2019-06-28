package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
		ArrayList<String> words=new ArrayList<String>();
		
		words.add("Gamze");
		words.add("Emre");
		words.add("Arda");
		words.add("Fevzi");
		words.add("Naime");
		words.add("Gizem");
		
		
		Iterator<String> it=words.iterator();
		while(it.hasNext()) {
		String name=it.next();
		if(name.endsWith("e")) {
			it.remove();
		}
	
		}
		
		System.out.println(words);
		
	}

}
