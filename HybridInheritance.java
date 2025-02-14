class grantParent4
{
	float height=5.4f;
	void readBooks()
	{
		System.out.println("I will read books");
	}
}
class parent4 extends grantParent4
{
	
}
class child01 extends parent4
{
	
}
class child02 extends parent4
{
	
}
class child03 extends parent4
{
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		child01 c11=new child01();
		System.out.println(c11.height);
		c11.readBooks();
		
		child02 c22=new child02();
		System.out.println(c22.height);
		c22.readBooks();		
		
		child03 c33=new child03();
		System.out.println(c33.height);
		c33.readBooks();	
		
	}

}
