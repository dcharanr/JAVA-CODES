import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>100 || n<0) {
			System.out.println("Invalid");
		}
		else if(n>=91) {
			System.out.println("A+");
		}
		else if(n>=81) {
			System.out.println("A");
		}
		else if(n>=71) {
			System.out.println("B+");
		}
		else if(n>=61) {
			System.out.println("B");
		}
		else if(n>=51) {
			System.out.println("C+");
		}
		else if(n>=35) {
			System.out.println("C");
		}
		else {
			System.out.println("fail");
		}		
		scan.close();
	}
}