package oops_questions;

public class Question_7 {

	class RemoveX {
		    public static String fixX(String str) {
		        int len = str.length();

		        if (len == 0) return str;

		        boolean startsWithX = str.charAt(0) == 'x';
		        boolean endsWithX = str.charAt(len - 1) == 'x';

		        if (startsWithX && endsWithX) {
		            return str.substring(1, len - 1);
		        } else if (startsWithX) {
		            return str.substring(1);
		        } else if (endsWithX) {
		            return str.substring(0, len - 1);
		        } else {
		            return str;
		        }
		    }
		    public static void main(String[] args) {
		    
		        System.out.println(fixX("xHix"));     
		        System.out.println(fixX("America"));  
		    }
		}

	}


