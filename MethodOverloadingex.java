
class Calculator{
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(int a,float b){
		System.out.println(a+b);
	}
	void add(int a,double b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	void add(int a,float b,double c){
		System.out.println(a+b+c);
	}
	void add(float a,int b,double c){
		System.out.println(a+b+c);
	}
}

public class MethodOverloadingex {

	public static void main(String[] args) {
		 Calculator Calc=new Calculator();
		 Calc.add(10,30);
		 Calc.add(10, 30f);
		 Calc.add(10, 300.5);
		 Calc.add(10, 20, 30);
		 Calc.add(10, 20f, 300.5);
		 Calc.add(20f, 30, 300.6);
	}

}
