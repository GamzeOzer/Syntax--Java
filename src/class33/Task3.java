package class33;

import java.util.LinkedHashMap;
import java.util.Map;

//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Print all keys and values from a Best Buy map using EntrySet.

public class Task3 {

	public static void main(String[] args) {
		
		Map<Integer,String> BestBuyStore=new LinkedHashMap<>();
		
		BestBuyStore.put(7664847,"Printer");
		BestBuyStore.put(7879885,"TV");
		BestBuyStore.put(3456788,"DVD Player");
		BestBuyStore.put(4567878,"I pod");
		
		for(Map.Entry<Integer, String> entry:BestBuyStore.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
	}

}
