package class34Review;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Write a program to
 *
 * Print in ascending order print an element in a tree set 
 * which is greater than
 * the given element 25 in
 *  ascending order.
 *
 * Print all elements in descending order
 *
 */


public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> tree_num=new TreeSet<>();
		tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);	
        
        
		Iterator<Integer> it=tree_num.iterator();
		while(it.hasNext()) {
			Integer a=it.next();
			if(a>25) {
				System.out.println(a);
			}
		}
		System.out.println("----------------------");
		
		for(Integer num:tree_num) {
			if(num>25) {
				System.out.println(num);
			}
		}
		
		System.out.println(tree_num);
		
		System.out.println(tree_num.descendingSet());
		
		
		
	}
	
	
     
}
