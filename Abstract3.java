
abstract class Bird
{
	abstract void eat();
	abstract void fly();
}

abstract class Eagle extends Bird
{
	void fly() {
		System.out.println("Eagle flies at greater height");
	}
}

class SerpentEagle extends Eagle{
	void eat() {
		System.out.println("SerpentEagle hunts over mountains and eats");
	}
}

 class GoldenEagle extends Eagle
 {
	 void eat() {
		 System.out.println("GoldenEagle hunts over ocean and eats");
	 }
 }
 
 class EagleFamily {
	 void permit(Bird ref) {
		 ref.eat();
		 ref.fly();
	 }
 }
 
 
 
public class Abstract3 {

	public static void main(String[] args) {
		SerpentEagle se=new SerpentEagle();
		GoldenEagle ge=new GoldenEagle();
//		se.eat();
//		se.fly();
//		ge.eat();
//		ge.fly();
		
		EagleFamily ef=new EagleFamily();
		ef.permit(se);
		ef.permit(ge);
	}

}
