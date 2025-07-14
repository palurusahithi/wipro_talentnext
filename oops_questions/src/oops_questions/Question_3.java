package oops_questions;

class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
	}
class Employee extends Person{
	private double annualSalary;
	private int yearStarted;
	private String nationalInsuranceNumber;

public Employee(String name,double annualSalary,int yearStarted,String nationalInsuranceNumber) {
	super(name);
	this.annualSalary=annualSalary;
	this.yearStarted=yearStarted;
	this.nationalInsuranceNumber=nationalInsuranceNumber;
	
	
	
}
public double getAnnualSalary() {
	return annualSalary;
}
public void setdoubleannualSalary(double annualSalary) {
	this.annualSalary=annualSalary;
}
public int getyearStarted() {
	return yearStarted;
}
public void setyearStarted(int yearStarted) {
	this.yearStarted=yearStarted;
}
public String  getnationalInsuranceNumber() {
	return nationalInsuranceNumber;
}
public void setnationalInsuranceNumber(String nationalInsuranceNumber) {
	this.nationalInsuranceNumber=nationalInsuranceNumber;
}
public String toString() {
	return "Employee Name : " + getName() +
			
	"\nAnnual Salary : " + annualSalary +
	"\nYear Started : " + yearStarted +
	"\nNation Insurance Number : + " + nationalInsuranceNumber;
}
}
public class Question_3{
	public static void main(String[] args) {
		Employee emp = new Employee("Alice", 85000.0, 2020, "NIN12345XYZ");
System.out.println(emp.toString());
	}
}
