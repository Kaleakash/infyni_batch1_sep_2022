class Operation {
	int a, b, sum;
	void setValue(int x, int y) {
		a=x;
		b=y;
	}
	void add(){
		sum = a+b;
	}
	void display() {
		System.out.println("Sum is "+sum);
	}
}
class App {
	public static void main(String args[]) {
	Operation op1 = new Operation();
	op1.display();
	Operation op2 = new Operation();
	op2.add();
	op2.display();
	Operation op3 = new Operation();
	op3.a=100;
	op3.b=200;
	op3.display();
	Operation op4 = new Operation();
	op4.a=1;
	op4.b=2;
	op4.add();
	op4.display();
	Operation op5 = new Operation();
	op5.setValue(10,20);
	op5.add();
	op5.display();
	}
}