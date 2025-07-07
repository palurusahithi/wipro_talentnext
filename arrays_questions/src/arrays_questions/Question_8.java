package arrays_questions;

public class Question_8 {
	public static void main(String[] args) {
		int[] arr= {10,3,6,1,2,4,7,5};
		int sum=0;
		boolean skip=false;
		for(int num:arr) {
			if(num==6) {
				skip=true;
			}
			if(!skip) {
				sum+=num;
			}
			if(skip&&num==7) {
				skip=false;
			}
		}
		System.out.println("sum : " + sum);
	}

}
