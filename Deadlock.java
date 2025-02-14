
class Family implements Runnable{

	String resourse1="PlayStation";
	String resourse2="Controller";
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Rohit")==true) {
			rohitAccquiredResources();
		}
		else {
			vijayAccquiredResources();
			
		}
	}
	void rohitAccquiredResources() {
		try {
			synchronized(resourse1) {
				System.out.println("Rohit acquried Controller");
				Thread.sleep(1000);
				synchronized (resourse2) {
					System.out.println("Rohit acquried playStation");
					Thread.sleep(1000);
				}
			}
		}catch(Exception e) {
			System.out.println("Rohit falied");
		}
	}
	void vijayAccquiredResources() {
		try {
			synchronized(resourse1) {
				System.out.println("vijay acquried Controller");
				Thread.sleep(1000);
				synchronized (resourse2) {
					System.out.println("vijay acquried playStation");
					Thread.sleep(1000);
				}
			}
		}catch(Exception e) {
			System.out.println("vijay falied");
		}
	}
	
}
public class Deadlock {

	public static void main(String[] args) {
		
		Family f=new Family();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);
		
		t1.setName("Rohit");
		t2.setName("Vijay");
		
		t1.start();
		t2.start();
		
	}

}
