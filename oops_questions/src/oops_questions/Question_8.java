package oops_questions;

public class Question_8 {

	
		class RemoveStar{
		    public static String removeStar(String str) {
		        String result = "";
		        for (int i = 0; i < str.length(); i++) {
		            if (i > 0 && str.charAt(i - 1) == '*') continue;
		            if (str.charAt(i) == '*') continue;
		            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
		            result += str.charAt(i);
		        }
		        return result;
		    }

		    public static void main(String[] args) {
		        System.out.println(removeStar("ab*cd"));   
		          
		    }
		}


	}


