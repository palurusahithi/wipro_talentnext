package collection_questions;

import java.util.*;

class CountryCapitalTreeMap {
    TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
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

    public TreeMap<String, String> reverseMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

   
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }
}

public class Question_16 {

    public static void main(String[] args) {
        CountryCapitalTreeMap map = new CountryCapitalTreeMap();

        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");
        map.saveCountryCapital("France", "Paris");

        
        System.out.println("Capital of India: " + map.getCapital("India"));

        System.out.println("Country with capital 'Tokyo': " + map.getCountry("Tokyo"));

        TreeMap<String, String> reversed = map.reverseMap();
        System.out.println("\nReversed TreeMap (Capital -> Country):");
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
