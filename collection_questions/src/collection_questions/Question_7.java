package collection_questions;

import java.util.Vector;
import java.util.Enumeration;

public class Question_7 {

    public static void main(String[] args) {
       
        Vector<String> months = new Vector<>();

      
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        
        System.out.println("Months of the year (using Enumeration):");
        Enumeration<String> e = months.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
