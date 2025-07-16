package abstraction_questions;

import java.util.Scanner;
class InvalidMarkException extends Exception {
 public InvalidMarkException(String message) {
     super(message);
 }
}

public class Question_6 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     for (int s = 1; s <= 2; s++) {
         try {
             System.out.print("Enter name of student " + s + ": ");
             String name = sc.nextLine();

             int total = 0;
             for (int i = 1; i <= 3; i++) {
                 System.out.print("Enter mark " + i + ": ");
                 String input = sc.nextLine();
                 int mark = Integer.parseInt(input);  // might throw NumberFormatException

                 if (mark < 0 || mark > 100) {
                     throw new InvalidMarkException("Mark should be between 0 and 100.");
                 }

                 total += mark;
             }

             double avg = total / 3.0;
             System.out.println("Average marks of " + name + ": " + avg);
             System.out.println();

         } catch (NumberFormatException e) {
             System.out.println("Please enter numbers only. Skipping this student.\n");
         } catch (InvalidMarkException e) {
             System.out.println("Invalid mark: " + e.getMessage() + " Skipping this student.\n");
         }
     }

     sc.close();
 }
}
