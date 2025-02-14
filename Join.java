class Demo12 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				System.out.println("JAVA");
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println();
			}
		}
	}
}
public class Join {

	public static void main(String[] args)throws Exception {
		
		System.out.println("Main thread started");
		Demo12 d1=new Demo12();
		d1.start();
		d1.join();
		System.out.println("Main thread completed");
	}

}
