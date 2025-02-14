
interface Calculator11{
	void add();
	void sub();
	
}

class Calculator22{
	public void mul() {
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	public void div() {
		int a=20;
		int b=30;
		System.out.println(a/b);
	}
}
class MyCalculator0 extends Calculator22 implements Calculator11{

	@Override
	public void add() {
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}


public class Interface1 {

	public static void main(String[] args) {
		
		
	}

}
