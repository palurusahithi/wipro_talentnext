package collection_questions;

import java.util.HashSet;
import java.util.Iterator;

class CountrySet {
    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String country = it.next();
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }
}

public class Question_8 {

    public static void main(String[] args) {
        CountrySet obj = new CountrySet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Germany");

        System.out.println("Search Result for 'India': " + obj.getCountry("India"));
        System.out.println("Search Result for 'France': " + obj.getCountry("France"));
    }
}
