package streams_questions;

import java.io.*;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        
        System.out.print("Enter the character to be counted: ");
        char targetChar = sc.nextLine().toLowerCase().charAt(0);  

        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            while ((ch = fr.read()) != -1) {
                char currentChar = Character.toLowerCase((char) ch); 
                if (currentChar == targetChar) {
                    count++;
                }
            }

            fr.close();
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }

        sc.close();
    }
}
