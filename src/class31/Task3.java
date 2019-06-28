package class31;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
	
		ArrayList<String> drinks=new ArrayList<String>();
		
		drinks.add("soda");
		drinks.add("cola");
		drinks.add("juice");
		drinks.add("sprite");
		drinks.add("fanta");
		
		for(int i=0;i<drinks.size();i++) {
			
			String drink=drinks.get(i);
			if(drink.contains("a") || drink.contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}

}
