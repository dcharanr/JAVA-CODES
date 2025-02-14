
class Demo4 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("User thread executing");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("User thread completed");
	}
}
class Demo44 extends Thread{
	@Override
	public void run() {
		for(;;) {
			System.out.println("Daemon thread executing");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DemonThread 
{
	public static void main(String[]args) 
	{
		System.out.println("Main thread executing");
		Demo4 d4= new Demo4();
		Demo44 d44= new Demo44();
		d44.setDaemon(true);
		d4.start();
		d44.start();
		System.out.println("main() method completed");
	}
}
