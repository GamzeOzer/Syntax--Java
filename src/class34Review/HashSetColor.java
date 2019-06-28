package class34Review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Store and Print the following elements using a HashSet “Red” 
 * “Green” “Black”
 * “White” “Pink” “Yellow”
 */

/**
*    * ReStore and Print the above hashSet in a TreeSet
*
*/
       
public class HashSetColor {

	public static void main(String[] args) {
		
		
		Set<String> colorSet=new HashSet<>();
		colorSet.add("Red");
		colorSet.add("Green");
		colorSet.add("Black");
		colorSet.add("White");
		colorSet.add("Pink");
		colorSet.add("Yellow");
		
		Iterator<String> it =colorSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		TreeSet<String> tree_set=new TreeSet<>(colorSet);
		
		System.out.println("-------------------");
		System.out.println(tree_set);
		
		System.out.println("-------------------");
		for(String color:tree_set) {
			System.out.println(color);
		}
		
		
	}
	
	
	
}
