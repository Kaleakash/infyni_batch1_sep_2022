class Employee {
	int id;
	String name;
	float salary;
	Employee() {
	System.out.println("Object created...Empty");
	id =123;
	name = "Unkown";
	salary =8000;
	}
	/*Employee(int id1, String name1, float salary1) {
	System.out.println("Parameterzied constructor");
		id = id1;
		name = name1;
		salary = salary1;
	}*/
	Employee(int id, String name, float salary) {
	System.out.println("Parameterzied constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void setValue(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("Employee class method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class ConstructorDemo {
	public static void main(String args[]) {
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	Employee emp3 = new Employee(1,"Ravi",14000);
	Employee emp4 = new Employee();
	emp4.setValue(2,"Ajay",18000);
	emp4.setValue(3,"Balaji",22000);
	emp1.display();
	emp2.display();
	emp3.display();
	emp4.display();
	}
}