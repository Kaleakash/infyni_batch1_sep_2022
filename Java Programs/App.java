class Car {
	int wheel;
	float price;
	String color;
	
	void start() {
		System.out.println("Car Start");
	}
	
	void appliedGear() {
		System.out.println("applied Gear");
	}
	
	void moving() {
		System.out.println("Car is moving");
	}
	
	void stop() {
		System.out.println("Car Stop");
	}
}
class App {
	public static void main(String args[]) {
	start();
	}
}