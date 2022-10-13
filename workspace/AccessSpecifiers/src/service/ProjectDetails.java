package service;

import bean.Employee;

public class ProjectDetails {

	Employee emp1 = new Employee();
	
	public void displayEmpInfo() {
		//System.out.println("a "+emp1.a);		private 
		//System.out.println("b "+emp1.b);		default 
		//System.out.println("c "+emp1.c);		protected 
		System.out.println("d "+emp1.d);		// public 
	}
}
