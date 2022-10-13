class Operation {
	int a, b,sum;		//a=0,b=0,sum=0
	void add() {
		sum = a+b;
	}
	void display() {
		System.out.println("sum is "+sum);
	}
}
class ConstructorDemo {
	public static void main(String args[]) {
	Operation op1 = new Operation();	op1.display();
	}
}