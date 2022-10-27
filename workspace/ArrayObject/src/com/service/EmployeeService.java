package com.service;

import com.bean.Employee;

public class EmployeeService {

		Employee employees[]=new Employee[100];
		int index=0;
		public String storeEmployee(Employee emp) {
														// id must be unqiue 
			// business logic 
			employees[index]=new Employee();
			employees[index].setId(emp.getId());
			employees[index].setName(emp.getName());
			employees[index].setSalary(emp.getSalary());
			index++;
			return "Employee record stored successfully "+emp.getName();
		}
		
		public void displayEmployeeDetails() {
			for(int i=0;i<index;i++) {
				System.out.println("Id is "+employees[i].getId()+" Name is "+employees[i].getName()+" Salary is "+employees[i].getSalary());
			}
		}
		
		// business method : increment the salary 			2		14000, 		1200 
		public String incrementSalary(Employee emp) {
			int flag =0;
			for(int i=0;i<index;i++) {
				if(employees[i].getId()==emp.getId()) {
					
					employees[i].setSalary(employees[i].getSalary()+emp.getSalary());	
					flag++;
					break;
				}
			}
			if(flag>0) {
				return "Salary incremented by user "+emp.getName();
			}else {
				return "Record not exists";
			}

		}
		
		public Employee findEmployeeById(int id) {
			for(int i=0;i<index;i++) {
				if(employees[i].getId()==id) {
					return employees[i];
				}
			}
			
			return null;
		}
		
}
