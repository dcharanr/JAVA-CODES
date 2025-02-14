
class Person
{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		super();
		this.name=name;
		this.age=age;
		
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
}

public class ToSTring {

	public static void main(String[] args) {
		
		Person p1=new Person("charan", 1);
		System.out.println(p1);
		Person p2=new Person("Charan",2);
		System.out.println(p2);
		
	}

}
