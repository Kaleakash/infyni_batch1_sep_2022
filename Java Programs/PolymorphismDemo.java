interface A {
	void dis1();
}
class B implements A {
	public void dis1() {
			System.out.println("A class method - override");
	}
	void dis2() {
		System.out.println("B class method");
	}
}
class PolymorphismDemo {
	public static void main(String args[]) {
	A obj = new B();	// sub class object and super class/interface reference super class can be normal class or abstract class or interface 
	obj.dis1();
	}
}