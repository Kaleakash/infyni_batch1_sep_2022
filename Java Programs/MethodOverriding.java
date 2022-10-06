class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike{
	void color() {
		System.out.println("Black");
	}					// re-usability 			60 
}
class Pulsar extends Bike{
	void color() {
		System.out.println("Red");
	}
	void speed() {
		System.out.println("90km/hr");			// override the code 		90 
	}
}
class Tvs extends Bike{
	void color() {
		System.out.println("Black");
	}
	void speed() {
		super.speed();
		System.out.println("10km/hr");			// merge the code. 		60 + 10 
	}
}

class MethodOverriding {
	public static void main(String args[]) {
	Honda hh = new Honda();		hh.color();		hh.speed();
	Pulsar pu = new Pulsar();		pu.color();		pu.speed();
	Tvs tv = new Tvs();			tv.color();		tv.speed();
	}
}