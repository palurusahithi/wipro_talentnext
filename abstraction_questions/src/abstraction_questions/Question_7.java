package abstraction_questions;


class InvalidCountryException extends Exception {
 public InvalidCountryException(String message) {
     super(message);
 }
}


public class Question_7 {

 public static void registerUser(String username, String userCountry) throws InvalidCountryException {
     if (!userCountry.equalsIgnoreCase("India")) {
         throw new InvalidCountryException("User Outside India cannot be registered");
     } else {
         System.out.println("User registration done successfully");
     }
 }

 
 public static void main(String[] args) {
     try {
         
         registerUser("Mickey", "US");
     } catch (InvalidCountryException e) {
         System.out.println(e);
     }

     try {
        
         registerUser("Mini", "India");
     } catch (InvalidCountryException e) {
         System.out.println(e);
     }
 }
}
