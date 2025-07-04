package javafundamentals;
import java.util.Scanner;
public class Question_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		int num=s.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
