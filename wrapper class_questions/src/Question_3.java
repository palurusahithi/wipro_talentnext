class Employee implements Cloneable {
    int id;
    String name;

   
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

 
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}

public class Question_3 {
    public static void main(String[] args) throws CloneNotSupportedException {
       
        Employee emp1 = new Employee(1, "Alice");

        
        Employee emp2 = emp1.clone();

       
        emp1.id = 2;
        emp1.name = "Bob";

       
        System.out.println("Original: ID = " + emp1.id + ", Name = " + emp1.name);
        System.out.println("Cloned  : ID = " + emp2.id + ", Name = " + emp2.name);
    }
}
