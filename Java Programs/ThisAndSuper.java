class A {
	int a=10;
}
class B extends A {
	int a=20;
	void dis() {
		int a=30;
		System.out.println(" a local variable "+a);
		System.out.println(" instance variable "+this.a);
		System.out.println(" super variable "+super.a);
	}
}
class ThisAndSuper{
	public static void main(String args[]) {
	B obj = new B();
	obj.dis();
	}
}