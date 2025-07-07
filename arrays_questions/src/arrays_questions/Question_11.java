package arrays_questions;
import java.util.Arrays;
public class Question_11 {
	public static void main(String[] args) {
		int[] arr= {1,4,2,4,1};
		boolean result=only14(arr);
		 System.out.println( result);
	}
		public static boolean only14(int[] arr) {
		for(int num:arr) {
			if(num!=1 && num!=4) {
				return false;
			}
		}
				return true;
			}
		}
		
	


