package class34Review;

import java.util.HashMap;
import java.util.Map;

/**
 * Store the following key value pairs in a Map and
 *
 * (Sun,1), (Tue, 2), (Wed, 3), (Thu, 4), (Fri,5), (Sun,7)
 *
 * Write program to test if the map contains a mapping for the specified key(6).
 *
 *
 */
public class MapEx {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Sun", 1);
		map.put("Tue", 2);
		map.put("Wed", 3);
		map.put("Thu", 4);
		map.put("Fri", 5);
		map.put("Sun", 7);
		
		System.out.println("Is the key Sat exists? >>>"+map.containsKey("Sat"));
		
		
		if (map.containsKey("Sat")) {
            // key exists
            System.out.println("yes! - " + map.get("Sat"));
        } else {
            // key does not exists
            System.out.println("no!");
        }

        System.out.println("\n key 'Tue' exists?\n");
        if (map.containsKey("Tue")) {
            System.out.println("yes!\n");
        } else {
            System.out.println("\n no!");
        }
	}

}
