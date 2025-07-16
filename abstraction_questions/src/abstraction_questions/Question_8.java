package abstraction_questions;

class InvalidAgeException extends Exception {
 InvalidAgeException(String message) {
     super(message);
 }
}

public class Question_8 {
 public static void main(String[] args) {
     try {
         String name = args[0];
         int age = Integer.parseInt(args[1]);

         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Age must be between 18 and 59.");
         }

         System.out.println("Name: " + name);
         System.out.println("Age: " + age);

     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Please provide both name and age as arguments.");
     } catch (NumberFormatException e) {
         System.out.println("Age must be a valid number.");
     } catch (InvalidAgeException e) {
         System.out.println("Invalid Age: " + e.getMessage());
     }
 }
}
