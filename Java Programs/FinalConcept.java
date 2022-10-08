final class Bike {
	final void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	/*void speed() {
		System.out.println("50km/hr");
	}*/
}
class FinalConcept {
	public static void main(String args[]) {
	final int A=10;
	//A=20;
	System.out.println(A);
	Honda hh = new Honda();
	hh.speed();
	}
}