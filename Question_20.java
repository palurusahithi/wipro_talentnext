package javafundamentals;
import java.util.Scanner;

public class Question_20 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int original = num;
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num = num / 10;
	        }

	        if (original == reversed) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }

	        sc.close();
	    }
	}