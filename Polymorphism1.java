
class Plane1
{
	void takeOff() {
		System.out.println("Plane is takeOff");
	}
	
	void fly() {
		System.out.println("Plane is flying");
	}
	
	void land() {
		System.out.println("Plane is landing");
	}
	
}

class CargoPlane1 extends Plane1
{
	@Override
	void takeOff() {
		System.out.println("CargoPlane is takeOff");
	}
	
	@Override
	void fly() {
		System.out.println("CargoPlane is flying");
	}
	
	@Override
	void land() {
		System.out.println("CargoPlane is landing");
	}
}
 class PassengerPlane1 extends Plane1
 {
	 @Override
		void takeOff() {
			System.out.println("PassengerPlane is takeOff");
		}
		
		@Override
		void fly() {
			System.out.println("PassengerPlane is flying");
		}
		
		@Override
		void land() {
			System.out.println("PassengerPlane is landing");
		}
 }
 
 class FighterPlane1 extends Plane1
 {
	 @Override
		void takeOff() {
			System.out.println("FighterPlane is takeOff");
		}
		
		@Override
		void fly() {
			System.out.println("FighterPlane is flying");
		}
		
		@Override
		void land() {
			System.out.println("FighterPlane is landing");
		}
 }
 


class Airport
{
	public void permit(Plane1 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}


public class Polymorphism1 {
	public static void main(String[] args) {
		
		CargoPlane1 cp=new CargoPlane1();
		PassengerPlane1 pp=new PassengerPlane1();
		FighterPlane1 fp=new FighterPlane1();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		
		
	}
}
