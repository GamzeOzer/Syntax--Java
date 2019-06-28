package class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


//remove the duplicate values 
public class Task1 {

	public static void main(String[] args) {
		
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        
        System.out.println(aList);
        Set<String> list=new LinkedHashSet<>(aList);
        //we kept the order and removed the duplicate values
        
        System.out.println(list);
        
	}

}
