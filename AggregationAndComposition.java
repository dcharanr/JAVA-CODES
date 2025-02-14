class OS
{
	private String name;
	private int size;
	
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}

}
class Charger
{
	private String brand;
	private float voltage;
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public float getVoltage() {
		return voltage;
	}
	
}
class Mobile
{
	//composite
	OS os=new OS("Android", 513);
	
	//aggregate
	public void hasA(Charger c){
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class AggregationAndComposition {

	public static void main(String[] args) {
		
		Charger c=new Charger("Samsung Charger", 30);
		
		Mobile m=new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		
		m.hasA(c);
		
		// Composite
		m=null;
		
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getSize());
//		m.hasA(c);
		
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}
