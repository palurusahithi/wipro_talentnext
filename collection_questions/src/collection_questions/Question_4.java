package collection_questions;

import java.util.ArrayList;

public class Question_4 {

    public static void main(String[] args) {
        
        ArrayList<Number> numbers = new ArrayList<>();

        
        numbers.add(10);           
        numbers.add(20.5);         
        numbers.add(15.2f);        
        numbers.add(100L);         
        numbers.add((short) 25);   
        numbers.add((byte) 5);     

        
        System.out.println("Numeric values in the ArrayList:");
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}
