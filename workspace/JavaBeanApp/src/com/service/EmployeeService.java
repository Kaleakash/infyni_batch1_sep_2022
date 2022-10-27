package com.service;

import com.bean.Employee;

public class EmployeeService {

	public Employee getEmployeeInfo() {
		// coding.......
		
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(12000);
		
		return emp;
	}
	
	
	public void storeEmployee(Employee emp) {
		System.out.println("Inside sevice method");
		System.out.println("id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		System.out.println("salary is "+emp.getSalary());
	}
	
	
}
