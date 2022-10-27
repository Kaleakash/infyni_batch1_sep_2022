package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int id;
		String name;
		float salary;
		EmployeeService es = new EmployeeService();
		String con = null;
		do {
			System.out.println("1:Add Employee , 2:Display Employee, 3 : Increment Salary 4: Search Employee");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			
			case 1:System.out.println("Plz enter the id");
			      id = sc.nextInt();
			      System.out.println("Enter the name");
			      name = sc.next();
			      System.out.println("Enter the salary");
			      salary = sc.nextFloat();
			      
			      Employee emp = new Employee();
			      emp.setId(id);
			      emp.setName(name);
			      emp.setSalary(salary);
			      
			      String result = es.storeEmployee(emp);
			      System.out.println(result);
				break;
			case 2: System.out.println("All Employee details are");
					es.displayEmployeeDetails();
				break;	
			case 3:System.out.println("Plz enter the id");
		      		id = sc.nextInt();
		      		System.out.println("Enter the name");
		      		name = sc.next();
		      		System.out.println("Enter the salary");
		      		salary = sc.nextFloat();
		      
		      		Employee emp1 = new Employee();
		      		emp1.setId(id);
		      		emp1.setName(name);
		      		emp1.setSalary(salary);
		      		String result1 = es.incrementSalary(emp1);
		      		System.out.println(result1);
		      		break;
			case 4:System.out.println("Enter the employee id");
			         id = sc.nextInt();
			         Employee searchEmp = es.findEmployeeById(id);
			         if(searchEmp==null) {
			        	 System.out.println("Record not present");
			         }else {
			        	 System.out.println("id is "+searchEmp.getId()+" Name is "+searchEmp.getName()+" Salary is "+searchEmp.getSalary());
			         }
			         break;
			default:System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to continue(y/n)");
			con = sc.next();
		} while (con.equals("y"));
		System.out.println("Thank you!");	
	}

}
