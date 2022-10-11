interface Client1 {
	public int add(int x, int y);
}
interface Client2 {
	public int sub(int x, int y);
}
class Manager implements Client1, Client2 {
	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public void ownMethod() {
		System.out.println("own method");
	}
}
class Abstraction {
	public static void main(String args[]) {
	Manager mgr = new Manager();
	System.out.println(mgr.add(100,200));
	System.out.println(mgr.sub(100,200));
	mgr.ownMethod();
	Client1 cl1 = new Manager();
	Client2 cl2 = new Manager();
	System.out.println(cl1.add(100,200));
	System.out.println(cl2.sub(100,200));
	}
}