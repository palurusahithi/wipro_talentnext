package arrays_questions;
import java.util.Scanner;
public class Question_13 {
	
	

	
	        public static void main(String[] args) {
	        	 Scanner sc=new Scanner(System.in);
	        
	        	  
	        	   int [][]arr=new int[2][2];
	        	   int []flat=new int[4];
	        	   int k=0;
	        	   System.out.println("enter the elements");
	        	   for(int i=0;i<2;i++) {
	        		   for(int j=0;j<2;j++) {
	        			  
	        			   arr[i][j]=sc.nextInt();
	        			   flat[k++]=arr[i][j];
	        		   }
	        	   }
	        	   for(int i=0;i<flat.length/2;i++) {
	        		   int temp=flat[i];
	        		   flat[i]=flat[flat.length-1-i];
	        		   flat[flat.length-1-i]=temp;
	        	   }
	        	   k=0;
	        	   for(int i=0;i<2;i++) {
	        		   for(int j=0;j<2;j++) {
	        			   arr[i][j]=flat[k++];
	        		   }
	        	   }
	        	   System.out.println("Reversed matrix is ");
	        	   for(int i=0;i<2;i++) {
	        		   for(int j=0;j<2;j++) {
	        			  System.out.print(arr[i][j]+" ");
	       
	        	   
	        }
	}
	        }
}
	
	



