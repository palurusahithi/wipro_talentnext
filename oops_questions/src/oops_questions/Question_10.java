package oops_questions;

import java.util.*;

public class Question_10 {

	class MergeStringJoiners{
		public static void main(String[] args) {
			StringJoiner s1=new StringJoiner("-");
			s1.add("Delhi");
			s1.add("Kolkata");
			StringJoiner s2=new StringJoiner("-");
			s2.add("Chennai");
			s2.add("Mumbai");
			StringJoiner mergedToS2 = new StringJoiner("-");
			mergedToS2.merge(s2);
			mergedToS2.merge(s1);
			System.out.println("s1 merged to s2 : " + mergedToS2);
		}
	}

}
