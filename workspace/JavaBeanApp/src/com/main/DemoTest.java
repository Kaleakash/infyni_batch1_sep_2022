package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		Employee emp1	= es.getEmployeeInfo();
		System.out.println("In main method");
		System.out.println("id is "+emp1.getId());
		System.out.println("name is "+emp1.getName());
		System.out.println("salary is "+emp1.getSalary());
		
		Employee emp2 = new Employee();
//		emp2.setId(101);
//		emp2.setName("Ramesh");
//		emp2.setSalary(14000);
		
		es.storeEmployee(emp1);
	}

}
