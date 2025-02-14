class grantParent1 extends grantParent
{
	
}

class gp2 extends grantParent1
{
	
}



class grantParent
{
	float height=5.4f;
	void readBooks()
	{
		System.out.println("I will read books");
	}
}
class parent1 extends grantParent
{
	
}
class child1 extends parent1
{
	
}



public class multilevelInheritance {

	public static void main(String[] args) {
		child1 c=new child1();
		System.out.println(c.height);
		c.readBooks();
		
		parent1 p=new parent1();
		System.out.println(p.height);
		p.readBooks();
	}

}
