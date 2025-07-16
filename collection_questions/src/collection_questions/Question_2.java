package collection_questions;


import java.util.ArrayList;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void GetEmployeeDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Email: " + email + ", Gender: " + gender + ", Salary: " + salary);
    }
}

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay slip for employee ID " + empId + " is: ₹" + e.salary;
            }
        }
        return "Employee not found!";
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Hari", "hari@example.com", "Male", 50000);
        Employee e2 = new Employee(102, "Priya", "priya@example.com", "Female", 60000);
        Employee e3 = new Employee(103, "Ravi", "ravi@example.com", "Male", 55000);

        EmployeeDB db = new EmployeeDB();
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("\nAll Employees:");
        for (Employee e : db.list) {
            e.GetEmployeeDetails();
        }

        System.out.println("\n" + db.showPaySlip(102));

        System.out.println("\nDeleting employee with ID 101...");
        db.deleteEmployee(101);

        System.out.println("\nUpdated Employee List:");
        for (Employee e : db.list) {
            e.GetEmployeeDetails();
        }
    }
}
