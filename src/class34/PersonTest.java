package class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer,Person> personMap=new HashMap<>();
	
		personMap.put(1, new Person("gamze", "ozer", 26, 90000));
		
		Collection<Person> person=personMap.values();
		
        for(Person per:person) {
        	per.personDetails();
        }

	}

}
