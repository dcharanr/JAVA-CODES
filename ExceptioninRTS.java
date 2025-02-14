import java.util.Scanner;

class Demo1
{
	void alpha() 
	{
		System.out.println("connection 4 is Estd");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numerator");
		int a = scan.nextInt();
		System.out.println("Enter Denominator");
		int b = scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection 4 is Terminated");
	
	}
}

class Demo2
{
	void beta() 
	{
		System.out.println("connection 3 is Estd");
		Demo1 d1=new Demo1();
		d1.alpha();
		System.out.println("connection 3 is Terminated");
		
	}
}
class Demo3
{
	void gamma()
	{
		System.out.println("connection 2 is Estd");
		Demo2 d2=new Demo2();
		d2.beta();
		System.out.println("connection 2 is Terminated");
	}
}


public class ExceptioninRTS {

	public static void main(String[] args) {
		
		
		System.out.println("connection 1 is Estd");
		try 
		{
			Demo3 d3=new Demo3();
			d3.gamma();
		}
		catch(Exception e)
		{
			System.out.println("Some problem occured");
		}
		System.out.println("connection 1 is Terminated");
	}

}
