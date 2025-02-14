import java.util.Scanner;

public class Degreestofarenheat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//input
		int a=scan.nextInt();	
		
		//logic (a*9/5)+32
		
		float f=(a*9.0f/5)+32;
		//output
		
		System.out.println(f);
		scan.close();
	}

}
