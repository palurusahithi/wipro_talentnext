package mini_project;

import java .util.Scanner;

public class Project_1 {



	public static void main(String[] args) {

	

		



		        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};

		        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};

		        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};

		        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};

		        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};

		        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};

		        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};

		        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};



		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter employee ID :");



		        if (!sc.hasNextInt()) {

		            System.out.println("Invalid input. Please enter a numeric employee ID.");

		            sc.close();

		            return;

		        }



		        int inputId = sc.nextInt();

		        sc.close();



		        int index = -1;

		        for (int i = 0; i < empNo.length; i++) {

		            if (empNo[i] == inputId) {

		                index = i;

		                break;

		            }

		        }



		        if (index == -1) {

		            System.out.println("There is no employee with empid : " + inputId);

		            return;

		        }



		        String designation = "";

		        int da = 0;

		        switch (desigCode[index]) {

		            case 'e':

		                designation = "Engineer";

		                da = 20000;

		                break;

		            case 'c':

		                designation = "Consultant";

		                da = 32000;

		                break;

		            case 'k':

		                designation = "Clerk";

		                da = 12000;

		                break;

		            case 'r':

		                designation = "Receptionist";

		                da = 15000;

		                break;

		            case 'm':

		                designation = "Manager";

		                da = 40000;

		                break;

		            default:

		                designation = "Unknown";

		        }



		        int salary = basic[index] + hra[index] + da - it[index];



		        System.out.println("\nEmp No.\tEmp Name\tDepartment\tDesignation\tSalary");

		        System.out.println(empNo[index] + "\t" + empName[index] + "\t\t" +

		                           department[index] + "\t" + designation + "\t" + salary);

		    }

		



	}



