import java.util.Scanner;

class Demo1 extends Thread{
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextInt()/scan.nextInt());
	}
}
public class someexamples1 {

	public static void main(String[] args) {
		
		Demo1 d1=new Demo1();
		d1.start();
		
	}

}
