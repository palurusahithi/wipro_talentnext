package streams_questions;

import java.io.*;
import java.util.*;

public class Question_2 {
    public static void main(String[] args) {
        try {
            // Step 1: Open input file
            BufferedReader reader = new BufferedReader(new FileReader("inputFile.txt"));

            // Step 2: Store word counts in TreeMap (sorted)
            Map<String, Integer> map = new TreeMap<>();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();

            // Step 3: Write word counts to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputFile.txt"));
            for (String word : map.keySet()) {
                writer.write(word + " : " + map.get(word));
                writer.newLine();
            }
            writer.close();

            System.out.println("✅ Word count written to outputFile.txt");

        } catch (FileNotFoundException e) {
            System.out.println("❌ inputFile.txt not found. Please make sure the file exists.");
        } catch (IOException e) {
            System.out.println("❌ Error reading or writing file: " + e.getMessage());
        }
    }
}
