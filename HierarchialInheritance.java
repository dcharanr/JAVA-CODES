class parent3
{
	float height=5.4f;
	void readBooks()
	{
		System.out.println("I will read books");
	}
}
class child001 extends parent3
{
	
}
class child2 extends parent3
{
	
}
class child3 extends parent3
{
	
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		child001 c1=new child001();
		System.out.println(c1.height);
		c1.readBooks();
		
		child2 c2=new child2();
		System.out.println(c2.height);
		c2.readBooks();		
		
		child3 c3=new child3();
		System.out.println(c3.height);
		c3.readBooks();		
	}

}
