package arrays_questions;
import java.util.Arrays;
public class Question_10 {
	public static void main(String[] args) {
		
	
int[] arr= {1,0,2,5,7,8};
int[] result=new int[arr.length];
 int index=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2==0) {
		result[index++]=arr[i];
	}
}
for(int i=0;i<arr.length;i++) {
	if(arr[i]%2!=0) {
		result[index++]=arr[i];
	}
}
System.out.println(Arrays.toString(result));
}

	
	    }



