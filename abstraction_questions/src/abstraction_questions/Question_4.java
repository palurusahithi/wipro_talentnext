package abstraction_questions;




		
		interface Test {
		    int myFunction(int a, int b, int c);
		}

		public class Question_4 {
		    public static void main(String[] args) {
		      
		        Test t1 = (a, b, c) -> a + b + c;

		      
		        Test t2 = (a, b, c) -> a * b * c;

		      
		        System.out.println("Sum using t1: " + t1.myFunction(2, 3, 4));       // 2 + 3 + 4 = 9
		        System.out.println("Product using t2: " + t2.myFunction(2, 3, 4));   // 2 * 3 * 4 = 24
		    }
		}
		

	


