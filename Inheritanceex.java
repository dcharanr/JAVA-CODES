class Test1{
	int x;
	int y;
	
	public Test1() {
		super();
		x=100;
		y=200;
	}
	public Test1(int x,int y){
		super();
		this.x=x;
		this.y=y;
	}
}
class Test2 extends Test1{
	int a,b;
	
	public Test2() {
		this(9,99);
		a=300;
		b=400;
	}
	public Test2(int a,int b) {
		super(a,b);
		this.a=a;
		this.b=b;
	}
	 void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
public class Inheritanceex {

	public static void main(String[] args) {
		
		Test2 t=new Test2();
		t.disp();
	}

}
