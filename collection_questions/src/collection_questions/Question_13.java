package collection_questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question_13 {

    public static void main(String[] args) {
       
        HashMap<String, String> countryCapital = new HashMap<>();

        countryCapital.put("India", "Delhi");
        countryCapital.put("Japan", "Tokyo");
        countryCapital.put("USA", "Washington");
        countryCapital.put("France", "Paris");

        String keyToSearch = "India";
        if (countryCapital.containsKey(keyToSearch)) {
            System.out.println("Key exists: " + keyToSearch);
        } else {
            System.out.println("Key not found: " + keyToSearch);
        }

      
        String valueToSearch = "Paris";
        if (countryCapital.containsValue(valueToSearch)) {
            System.out.println("Value exists: " + valueToSearch);
        } else {
            System.out.println("Value not found: " + valueToSearch);
        }

       
        System.out.println("\nIterating through the HashMap using Iterator:");
        Set<Map.Entry<String, String>> entrySet = countryCapital.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
