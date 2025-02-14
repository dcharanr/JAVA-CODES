

class Demo{
	
	private Demo() {}
		
	 private static class Inner{
		static Demo INSTANCE = new Demo();
	 }
	 
	 
	 
	 public static final Demo getInstance(){
		 return Inner.INSTANCE;
	 }
}


public class Singleton {

	public static void main(String[] args) {
		
		Demo o1=Demo.getInstance();
		Demo o2=Demo.getInstance();
		Demo o3=Demo.getInstance();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}

}
