package arrays_questions;
import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many numbers");
        int num=s.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the numbers:");
		for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<num;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("Maximum value is: " + max);
		System.out.println("Minimum value is: " +min);
	}

}
