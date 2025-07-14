package oops_questions;
public class Question_5{
	public static String getFirstHalf(String str) {

		if(str.length() %2 == 0) {
			return str.substring(0,str.length()/2);
		}
		else {
			return null;
		}
	}
	
			public static void main(String[] args) {
		System.out.println(getFirstHalf("TomCat"));
			
		}
}
