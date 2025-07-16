package collection_questions;

import java.util.*;
import java.util.stream.*;

class Student {
    int rollNo;
    String name;
    int mark;

 
    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class Question_21 {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 45));
        students.add(new Student(2, "Bob", 55));
        students.add(new Student(3, "Charlie", 60));
        students.add(new Student(4, "David", 35));
        students.add(new Student(5, "Eva", 75));

      
        long clearedCount = students.stream()
                                    .filter(s -> s.mark >= 50)
                                    .count();

        System.out.println("Number of students who cleared: " + clearedCount);
    }
}
