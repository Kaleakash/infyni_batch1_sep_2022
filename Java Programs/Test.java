import java.util.Scanner;
//import java.util.*;
class Test {
	public static void main(String args[]) {
	Scanner obj = new Scanner(System.in);
	
	/*System.out.println("Enter the value of a ");
	int a = obj.nextInt();		// scan int value through keyboards. 
	System.out.println("Value of a "+a);
	char abc ='%';
	String name = "Raj Deep";
	System.out.println(abc);
	System.out.println(name);*/
	System.out.println("Enter the id");
	int id = obj.nextInt();
	System.out.println("Enter the name");
	String name = obj.next();
	System.out.println("Enter the salary");
	float salary = obj.nextFloat();
	System.out.println("id is "+id+" name is "+name +" salary is "+salary);
	System.out.printf("id is %d, name is %s and salary is %f",id,name,salary);
	}
}