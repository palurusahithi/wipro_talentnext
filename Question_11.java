package javafundamentals;
import java.util.Scanner;
public class Question_11 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int sum=0;
	for(int i=num;i!=0;i=i/10) {
		int digit=i%10;
		sum+=digit;
	}
	System.out.println("Sum of digits" + sum);

	}

}
