
class Demo0 implements Runnable{
	@Override
	public void run(){
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name +"Executing first line");
			Thread.sleep(3000);
			System.out.println(name +"Executing second line");
			Thread.sleep(3000);
			System.out.println(name +"Executing Third line");
			Thread.sleep(3000);
			synchronized(this) {
				System.out.println(name +"Executing fourth line");
				Thread.sleep(3000);
				System.out.println(name +"Executing fifth line");
				Thread.sleep(3000);
			}
			System.out.println(name +"Executing sixth line");
			Thread.sleep(3000);
			System.out.println(name +"Executing seventh line");
			Thread.sleep(3000);
			System.out.println(name +"Executing eighth line");
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Some problem Occured");
		}
		
	}
}

public class Synchronized2 {

	public static void main(String[] args) {
		
		Demo0 d1 = new Demo0();
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
		t1.setName("One");
		t2.setName("Two");
		t1.start();
		t2.start();
	}
}
