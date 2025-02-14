
import java.util.Scanner;
class Demo111 extends Thread{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
        t.setName("Charan");
        
        t.setPriority(9);
        System.out.println(t);
        System.out.println(t.getName()+" "+t.getPriority()+" "+t.getThreadGroup());
        
	}
}
public class someexamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Demo111 d1 = new Demo111();
        d1.start();
        
        Thread t=Thread.currentThread();
        t.setName("Charan");
        
        t.setPriority(1);
        System.out.println(t);
        System.out.println(t.getName()+" "+t.getPriority()+" "+t.getThreadGroup());
    }
}
