package oops_questions;

public class Question_6{
	class ShortLongShort {
		public static String combine(String a,String b) {
			if(a.length()<b.length()) {
				return a+b+a;
			}
			else {
				return b+a+b;
			}
		}
		public static void main(String[] args) {
			System.out.println(combine("hi","hello"));
		}
	

	}

}
