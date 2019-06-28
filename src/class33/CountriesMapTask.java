package class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Create a map of a building. Store floor number and it is associated company name.
 *  (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */

public class CountriesMapTask {
public static void main(String[] args) {
    Map<String,String> countries=new HashMap<>();
    countries.put("Canada", "Ottawa");
    countries.put("USA", "Washington");
    countries.put("Latvia", "Riga");
    countries.put("Estonia", "Tallin");
    countries.put("Russia", "Moscow");
    countries.put("France", "Paris");
    
    System.out.println("PRINTING ALL KEYS AND VALUES");
    System.out.println("Using for each loop------");
    Set <String> country=countries.keySet();
    for (String s:country) {
        System.out.println("Country "+s+" has capital city "+countries.get(s));
    }
    System.out.println("Using Iterator----");
    Iterator<String> itCountry=country.iterator();
    while  (itCountry.hasNext()) {
        String c=itCountry.next();
        System.out.println("Country "+c+" has capital city "+countries.get(c));
    }
    
    System.out.println("PRINTING ONLY VALUES");
    Collection<String> capitals=countries.values();
    System.out.println("Using for each loop------");
    for (String s:country) {
        System.out.println("Capital city "+s);
    }
    
}
}