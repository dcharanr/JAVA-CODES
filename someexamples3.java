
class Demo11 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"start executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executed.");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class Demo22 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"start executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executing.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is executed.");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class someexamples3 {

	public static void main(String[] args) throws Exception {
		System.out.println(Thread.currentThread().getName()+"is executing..");
		Demo11 d1 = new Demo11();
		Demo22 d2 = new Demo22();
		
		d1.start();
		d1.join();
		d2.start();
		d1.join();
		System.out.println(Thread.currentThread().getName()+"completed the executing..");
		
		
	}

}
