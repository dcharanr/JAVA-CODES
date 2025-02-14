
class Car
{
	String name;
	int noOfSeats;
	float cost;
}

public class pvbpvr {

	public static void main(String[] args) {
		Car a = new Car();
		a.name="maruthi";
		a.noOfSeats=5;
		a.cost=8.66f;
		
		
		Car b;
		b=a;
		System.out.println(b.name);
		System.out.println(b.noOfSeats);
		System.out.println(b.cost);
		
		b.name="kia";
		b.noOfSeats=6;
		b.cost=6.77f;
		
		System.out.println(b.name);
		System.out.println(b.noOfSeats);
		System.out.println(b.cost);
		
		System.out.println(a.name);
		System.out.println(a.noOfSeats);
		System.out.println(a.cost);
		
	}

}

// pass by value
//int a=1000;
//int b;
//b=a;
//System.out.println(a);
//System.out.println(b);
//
//b=2000;
//System.out.println(a);
//System.out.println(b);