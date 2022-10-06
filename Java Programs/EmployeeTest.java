import java.util.Scanner;
class Employee {
	private int id;
	private String name;
	private float salary;
	Scanner sc = new Scanner(System.in);
	Address add  = new Address();
	void readEmp() {
		System.out.println("Enter the id");
		id = sc.nextInt();
		System.out.println("Enter the name");
		name= sc.next();
		System.out.println("Enter the salary");
		salary = sc.nextFloat();
	}
	/*
		calculateSalary 		hra = 10%, da = 5% and pf = 7% 
		grossSalary = hra, da, pf 
	*/
	void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class Manager  extends Employee{
	private int numberOfEmp;
	void readMgr() {
		readEmp();		// calling employee class method 
		System.out.println("Enter the numberOfEmployee ");
		numberOfEmp = sc.nextInt();
		add.readAdd();	// calling address class method 
	}
	void disMgr() {
		disEmp();
		System.out.println("Number of employee are "+numberOfEmp);
		add.disAdd();
	}
}
class Developer extends Employee {
	private String projectName;
	void readDev() {
		readEmp();
		System.out.println("Enter the projectName ");
		projectName = sc.next();
		add.readAdd();
	}
	void disDev() {
		disEmp();
		System.out.println("ProjectName is  "+projectName);
		add.disAdd();
	}
}
class Address {
	private String city;
	private String state;
	Scanner sc = new Scanner(System.in);
	void readAdd() {
		System.out.println("Enter the city");
		city = sc.next();
		System.out.println("Enter the state");
		state = sc.next();
	}
	void disAdd() {
		System.out.println("city is "+city);
		System.out.println("state is "+state);
	}
}
class EmployeeTest {
	public static void main(String args[]) {
	Manager mgr = new Manager();
	Developer dev = new Developer();
	System.out.println("Enter the manager details");
		mgr.readMgr();
	System.out.println("Enter the developer details");
	dev.readDev();	
	System.out.println("Manager details ");
	mgr.disMgr();
	System.out.println("Developer detils");
	dev.disDev();	
	}
}

