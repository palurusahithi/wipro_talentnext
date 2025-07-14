package oops_questions;

import java.util.*;

class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class Question_11 {
    public static void main(String[] args) {
      
        Employee emp = new Employee("John");

        
        Employee result = Optional.ofNullable(emp)
                                  .orElseThrow(() -> new InvalidEmployeeException("Employee object is null"));

        System.out.println("Employee Name: " + result.name);
    }
}
