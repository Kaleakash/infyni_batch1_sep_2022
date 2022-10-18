package abc;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" i "+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println(" j "+j);
		}
	}
}
public class ExtreandThreadClassExample {

	public static void main(String[] args) {
		A obj1 = new A();		// thread class object. ie thread object created.  
		B obj2 = new B();		// thread class object 
		obj1.start();			// ready to run : Runnable state 
		obj2.start();			// ready to run : Runnable state 
	}

}
