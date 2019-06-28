package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Toyota");
		cars.add("Nissan");
		cars.add("Hundai");
		cars.add("Mercedes");

		// 1.way using for loop

		System.out.println("------------usig for loop ---------------");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		// 2.way using for loop

		System.out.println("------------usig advanced for loop ---------------");

		for (String car : cars) {
			System.out.println(car);
		}

		// 3.way using for loop

		System.out.println("------------usig Iterator---------------");

		Iterator<String> iter = cars.iterator();
		// hasNext();, next();, remove();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// 4.way using for loop
		
		System.out.println("------------usig while loop ---------------");
		int i = 0;
		while (i < cars.size()) {
			System.out.println(cars.get(i));
			i++;
		}

	}

}
