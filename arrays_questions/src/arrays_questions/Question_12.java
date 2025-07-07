package arrays_questions;

import java.util.Arrays;

public class Question_12 {
public static void main(String[] args) {
	int[] a= {1,2,3};
	int[] b= {4,5,6};
	int[] result = middleWay(a, b);
	for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]);
        if (i < result.length - 1) {
            System.out.print(", ");
            
	
}
}
}
public static int[] middleWay(int[] a, int[] b) {
    int[] newArray = new int[2];
    newArray[0] = a[1]; 
    newArray[1] = b[1]; 
    return newArray;
}
}