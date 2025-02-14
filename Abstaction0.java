
abstract class Plane2
{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class CargoPlane2 extends Plane2
{
	void takeOff() {
		System.out.println("CargoPlane is taking off");
	}
	void fly() {
		System.out.println("CargoPlane is flying at lowerHeights");
	}
	void land() {
		System.out.println("CargoPlane is landing");
	}
}

class PassengerPlane2 extends Plane2
{
	void takeOff() {
		System.out.println("PassengerPlane is taking off");
	}
	void fly() {
		System.out.println("PassengerPlane is flying at lowerHeights");
	}
	void land() {
		System.out.println("PassengerPlane is landing");
	}
}

class FighterPlane2 extends Plane2
{
	void takeOff() {
		System.out.println("FighterPlane is taking off");
	}
	void fly() {
		System.out.println("FighterPlane is flying at lowerHeights");
	}
	void land() {
		System.out.println("FighterPlane is landing");
	}
}


class Airport1
{
	public static void permit(Plane2 dc) {
		dc.takeOff();
		dc.fly();
		dc.land();
	}
}




public class Abstaction0 {

	public static void main(String[] args) {
		
		CargoPlane2 cp=new CargoPlane2();
		PassengerPlane2 pp=new PassengerPlane2();
		FighterPlane2 fp=new FighterPlane2();		
		
		Airport1.permit(cp);
		Airport1.permit(pp);
		Airport1.permit(fp);
	}

}
