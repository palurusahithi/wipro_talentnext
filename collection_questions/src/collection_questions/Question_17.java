package collection_questions;

import java.util.*;

class CountryCapitalHashtable {
    Hashtable<String, String> M1 = new Hashtable<>();

    
    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

  
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

   
    public Hashtable<String, String> reverseMap() {
        Hashtable<String, String> M2 = new Hashtable<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }
}

public class Question_17 {

    public static void main(String[] args) {
        CountryCapitalHashtable map = new CountryCapitalHashtable();

       
        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Germany", "Berlin");
        map.saveCountryCapital("Italy", "Rome");

      
        System.out.println("Capital of India: " + map.getCapital("India"));

        
        System.out.println("Country with capital 'Rome': " + map.getCountry("Rome"));

       
        Hashtable<String, String> reversed = map.reverseMap();
        System.out.println("\nReversed Hashtable (Capital -> Country):");
        for (Map.Entry<String, String> entry : reversed.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       
        System.out.println("\nList of all countries:");
        ArrayList<String> countries = map.getAllCountries();
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
