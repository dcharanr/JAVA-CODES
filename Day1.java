import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//input
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		//Logic
		
		int sum1=a+b;
		int sum2=a+c;
		int sum3=b+c;
		
		//output
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		scan.close();

	}

}
