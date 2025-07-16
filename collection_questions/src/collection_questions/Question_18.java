package collection_questions;

import java.util.*;

public class Question_18 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Date");
        al.add("Elderberry");
        al.add("Fig");
        al.add("Grape");
        al.add("Honeydew");
        al.add("IndianFig");
        al.add("Jackfruit");

        
        Collections.reverse(al);

      
        al.forEach(word -> System.out.println(word));
    }
}

