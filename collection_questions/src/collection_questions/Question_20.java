package collection_questions;


interface NumberCheck {
 void check(int num);
}


class Prime {
 Prime(int num) {
     if (isPrime(num)) {
         System.out.println(num + " is Prime");
     } else {
         System.out.println(num + " is Not Prime");
     }
 }


 boolean isPrime(int n) {
     if (n <= 1) return false;
     for (int i = 2; i < n; i++) {
         if (n % i == 0) return false;
     }
     return true;
 }
}


public class Question_20 {
 public static void main(String[] args) {
     NumberCheck ref = Prime::new; 

     ref.check(11); 
     ref.check(9);  
 }
}
