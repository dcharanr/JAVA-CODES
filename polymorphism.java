
class Plane
{
	void fly() {
		System.out.println("Plane is flying");
	}
}

class CargoPlane extends Plane
{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at lower height");
	}
	
	void CarryCargo() {
		System.out.println("CargoPlane is carrying cargo");
	}
}

class PassengerPlane extends Plane
{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at Medium height");
	}
	
	void CarryPassenger() {
		System.out.println("PassengerPlane is carrying Passengers");
	}
}

class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at Great height");
	}
	
	void CarryWeapons() {
		System.out.println("FighterPlane is carrying Weapons");
	}
}





public class polymorphism {

	public static void main(String[] args) {
		
		Plane def;
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		def=cp;
		def.fly();
		((CargoPlane)def).CarryCargo();
		
		def=pp;
		def.fly();
		((PassengerPlane)def).CarryPassenger();
		
		def=fp;
		def.fly();
		((FighterPlane)def).CarryWeapons();
		
		
	}

}
