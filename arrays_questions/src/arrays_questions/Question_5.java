package arrays_questions;

import java.util.Arrays;

public class Question_5 {

	public static void main(String[] args) {
		int[] arr= {21,45,78,10,25,67};
		
		Arrays.sort(arr);
		int smallest1=arr[0];
		int smallest2=arr[1];
		int largest1=arr[arr.length-1];
		int largest2=arr[arr.length-2];
		System.out.println("Smallest numbers: " + smallest1 + " , " + smallest2);
		System.out.println("Largest numbers: " + largest1 + " , " + largest2);
		
	}
}
