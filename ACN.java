import java.util.Scanner;

class Demo2 implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(name.equals("ADD")) {
			add();
		}else if(name.equals("CHAR")){
			charPrint();
		}else {
			numPrint();
		}
	}
	


	public void add() {
		System.out.println("Addition task started");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scanner.nextInt();
		System.out.println("enter the second number");
		int b = scanner.nextInt();
		int c = a+b;
		System.out.println(c);
		System.out.println("Addition task completed");
	}


	public void charPrint() {
		System.out.println("Character printing task started");
		for(int i=65;i<70;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing task completed");
	}



	public void numPrint() {
		System.out.println("Number printing task started");
		for(int i=1;i<11;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing task completed");
	}

}

public class ACN {

	public static void main(String[] args) {
		
		Demo2 sr=new Demo2();
		
		Thread t1 = new Thread(sr);
		Thread t2 = new Thread(sr);
		Thread t3 = new Thread(sr);
		
		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		t1.start();
		t2.start();
		t3.start();	
	}

}
