package collection_questions;

import java.util.*;
import java.util.function.Predicate;

public class Question_22 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("madam", "apple", "racecar", "java", "noon", "hello", "civic", "world", "level", "radar");

        Predicate<String> isPalindrome = word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        System.out.println("Palindromes:");
        words.stream()
             .filter(isPalindrome)
             .forEach(System.out::println);
    }
}
