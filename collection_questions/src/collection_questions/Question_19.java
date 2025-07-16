package collection_questions;


interface WordCount {
    int count(String str);
}

public class Question_19 {
    public static void main(String[] args) {
        WordCount wordCounter = (str) -> {
            if (str == null || str.trim().isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        };

        String testString = "This is a test string for counting words.";
        int count = wordCounter.count(testString);
        System.out.println("Number of words: " + count);
    }
}
