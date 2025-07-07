package oops_questions;
import java.util.Scanner;
public class Question_1 {
	public static int powerInt(int num1,int num2) {
		
		
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,int num2) {
		return Math.pow(num1,num2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer base: ");
        int intBase = sc.nextInt();
        System.out.print("Enter an integer exponent: ");
        int intExponent = sc.nextInt();
        int intResult = powerInt(intBase, intExponent);
        System.out.println("Result (int): " + intResult);
        System.out.print("Enter a double base: ");
        double doubleBase = sc.nextDouble();
        System.out.print("Enter an integer exponent: ");
        int doubleExponent = sc.nextInt();
        double doubleResult = powerDouble(doubleBase, doubleExponent);
        System.out.println("Result (double): " + doubleResult);
	}
	

}
