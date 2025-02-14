//given an integer value n.
//write a program to print the sum of all digits in n.

import java.util.Scanner;

public class Loops {

	public static int reverseOfDigits(int n) {
		int rev=0,last=0;
		while(n!=0) {
			last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		int res=reverseOfDigits(n);
		System.out.println(res);
		scan.close();
	}
	
	
}

