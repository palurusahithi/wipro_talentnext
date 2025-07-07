package arrays_questions;

public class Question_7 {

	public static void main(String[] args) {
		int[] arr= {12,37,56,12,75};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			boolean isDuplicate=false;
		
for(int j=0;j<i;j++){
	if(arr[i]==arr[j] ){
		isDuplicate=true;
		break;
	}
}
if (!isDuplicate) {
    System.out.print(arr[i] + " ");
	
}
		}
	}
}


