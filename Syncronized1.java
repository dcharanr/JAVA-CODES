class Printer implements Runnable{
	@Override
	synchronized public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name +"Started printing");
		for(int i=1;i<4;i++) {
			System.out.println(name +" is printing");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name +"complted printing");
	}
}
public class Syncronized1 {

	public static void main(String[] args) {
		
		Printer p=new Printer();
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		
		t1.setName("MEN");
		t2.setName("WOMEN");
		t3.setName("CHILD");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
