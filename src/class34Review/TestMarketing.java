package class34Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMarketing {

	public static void main(String[] args) {
		
		
		Map<String,Marketing> sales=new HashMap<>();
		
		sales.put("Joe",new Marketing("joe", "shoes", 2000.00));
		sales.put("Smith", new Marketing("Smith", "shoes", 4000.00));
		sales.put("Adam", new Marketing("Adam", "shoes", 6000.00));
		sales.put("Tiffany", new Marketing("Tiffany", "shoes", 4000.00));
		sales.put("Aloha", new Marketing("Aloha", "shoes", 4000.00));
		sales.put("Sam", new Marketing("Sam", "shoes", 4000.00));
		sales.put("Mustafa", new Marketing("Mustafa", "shoes", 4000.00));
		sales.put("Kelda", new Marketing("Kelda", "shoes", 4000.00));
		
		for(String key:sales.keySet()) {
			Marketing m=sales.get(key);//m marketing objenin ismi
			
			if(m.getSaleAmount()>3000) {
				System.out.println(m.toString());//burada da kisaca yazdirdik 
			}
			
			
		}

	}

}
