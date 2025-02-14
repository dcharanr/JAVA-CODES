import java.util.Scanner;

public class GreatestCommonDivisor {
	
	//Brute Force Approach  O(min(a,b))
//	static int gcd(int a, int b) {
//		int min=0;
//		if(a<b) {
//			min=a;
//		}else {
//			min=b;
//		}
//		
//		for(int i=min; i>=1; i--) {
//			if(a%i==0 && b%i==0) {
//				return i;
//			}
//		}
//		return 1;
//	}
	
	//      euclidsgcd   O(min(a,b))
//	static int euclidsgcd(int a, int b) {
//		while(a!=b) {
//			if(a>b) {
//				a=a-b;
//			}
//			else {
//				b=b-a;
//			}
//		}
//		return a;
//	}
	
	
	// euclids by optimize Gabrieal  Lame   O(log(min(a,b))
	static int euclidsOptimizedgcd(int a, int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
			return b;
		}
	}	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
//		System.out.println(gcd(a, b));
//		System.out.println(euclidsgcd(a, b));
		System.out.println(euclidsOptimizedgcd(a, b));
		scan.close();
	}

}
