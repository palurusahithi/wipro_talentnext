package arrays_questions;

public class Question_1 {
	public static void main(String[] args) {
		int[] num= {12,45,32,41};
		int sum=0;
		double average;
		for(int i=0;i<num.length;i++) {
			sum +=num[i];
		}
		average=(double)sum/num.length;
		System.out.println("Sum of numbers is: " + sum);
		System.out.println("Average of numbers is: " + average);
	}

	

}
