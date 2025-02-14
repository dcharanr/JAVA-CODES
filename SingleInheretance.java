class parent
{
	float height=5.4f;
	void readBooks()
	{
		System.out.println("I will read books");
	}
}
class child extends parent
{
	
}



public class SingleInheretance {

	public static void main(String[] args) {
		child c=new child();	
		System.out.println(c.height);
		c.readBooks();
		
	}

}
