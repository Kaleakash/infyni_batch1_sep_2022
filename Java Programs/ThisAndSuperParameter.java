class A {
	A() {
		//this(10);
		System.out.println("A()");
	}
	A(int x) {
		this(10,20);
		System.out.println("A(int)");
	}	
	A(int x, int y) {
		this();
		System.out.println("A(int,int)");
	}
}
class B extends A {
	B() {
		super(10);
		System.out.println("B()");
	}
}
class ThisAndSuperParameter{
	public static void main(String args[]) {
	//A obj1 = new A();
	//A obj2 = new A(10);
	//A obj3 = new A(10,20);
	B obj4 = new B();
	}
}