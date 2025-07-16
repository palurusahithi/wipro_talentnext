package collection_questions;

import java.util.*;

public class Question_15 {

    public static void main(String[] args) {
        
        HashMap<String, Integer> contactList = new HashMap<>();

        contactList.put("Sahithi", 830967287);
        contactList.put("Suji", 630525177);
        contactList.put("sravani", 765432109);
        contactList.put("Seeta", 987123456);

        String nameToSearch = "Paluru";
        if (contactList.containsKey(nameToSearch)) {
            System.out.println("Contact exists with name: " + nameToSearch);
        } else {
            System.out.println("No contact found with name: " + nameToSearch);
        }

      
        int numberToSearch = 987654321;
        if (contactList.containsValue(numberToSearch)) {
            System.out.println("Phone number exists: " + numberToSearch);
        } else {
            System.out.println("Phone number not found: " + numberToSearch);
        }

      
        System.out.println("\nAll contacts:");
        Set<Map.Entry<String, Integer>> entries = contactList.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
