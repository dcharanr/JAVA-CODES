import java.util.Scanner;

abstract interface Calculator1  //here abstract no need but i given clear understanding
{
	//by defalut public and abstact are there but i have given for clear reference
	//you can remove it works
	public abstract void add();
	public abstract void sub();
}

class MyCalculator1 implements Calculator1
{
	@Override
	public void add() {     //here public must be written bcz in interface by defalut public,abstract given by jvm.=
		int a=200;
		int b=100;
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		int a=200;
		int b=100;
		System.out.println(a-b);
	}
}

class MyCalculator2 implements Calculator1
{
	@Override
	public void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the Second number");
		int b=scan.nextInt();
		System.out.println(a+b);
	}
	@Override
	public void sub() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the Second number");
		int b=scan.nextInt();
		System.out.println(a-b);
	}
}

class MyCalculator3 implements Calculator1
{
	@Override
	public void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the Second number");
		int b=scan.nextInt();
		if(a>b) {
			System.out.println(a+b);
		}
		else {
			System.out.println("Invaild Input");
			System.exit(0);
		}
	}
	@Override
	public void sub() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the Second number");
		int b=scan.nextInt();
		
		if(b>a) {
			System.out.println(a-b);
		}
		else {
			System.out.println("Invaild Input");
			System.exit(0);
		}
	}
}

//polymorphism done here using calci class 
// and Calculator1 is Parent and ch is refernce
class calci 
{
	public void permit(Calculator1 ch) {
		ch.add();
		ch.sub();
	}
}



public class Interface {

	public static void main(String[] args) {
		MyCalculator1 mc1=new MyCalculator1();
		MyCalculator2 mc2=new MyCalculator2();
		MyCalculator3 mc3=new MyCalculator3();
		
		
		calci c=new calci();
		
		c.permit(mc1);
		c.permit(mc2);
		c.permit(mc3);

	}

}
