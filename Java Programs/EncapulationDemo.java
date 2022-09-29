class Employee {
	private int id;
	private String name;
	private float salary;
	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		if(salary<0){
			this.salary = 8000;
		}else {
			this.salary = salary;
		}	
	}
	void setSalary(float salary){
		this.salary = salary;
	}
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class EncapulationDemo {
	public static void main(String args[]) {
	//display();
	//id=100;
	Employee emp1  = new Employee(1,"Ravi",12000);
	//emp1.id=100;
	//emp1.name="Ravi";
	//emp1.salary = -12000;
	//emp1.setEmployeeInfo(1,"Ravi",12000);
	//emp1.setSalary(14000);
	emp1.display();
	}
}