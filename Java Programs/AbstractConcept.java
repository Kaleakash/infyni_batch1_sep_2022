abstract class Bike {
	void mailage(){
		System.out.println("40 km/l");
	}
	abstract void speed();
}
abstract class Honda extends Bike{
	void color() {
		System.out.println("Black");
	}
	void mailage(){
		System.out.println("60 km/l");
	}					
}
class Activa extends Honda {
	void speed() {
		System.out.println("50km/hr");			
	}
}
class Pulsar extends Bike{
	void color() {
		System.out.println("Red");
	}
	void speed() {
		System.out.println("90km/hr");			
	}
}
class AbstractConcept {
	public static void main(String args[]) {
	//Honda hh = new Honda();		hh.speed();		hh.color();	hh.mailage();
	Activa aa =new Activa();			aa.speed();		aa.color();	aa.mailage();
	Pulsar pu = new Pulsar();		pu.speed();		pu.color();	pu.mailage();
	}
}