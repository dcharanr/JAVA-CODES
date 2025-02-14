import java.util.Scanner;

public class LeastCommonFactor {
	
	//Brute Force Approach  
//	static int lcm(int a,int b) {
//		int res=Math.max(a, b);
//		while(true) {
//			if(res%a==0 && res%b==0) {
//				break;
//			}
//			res++;
//		}
//		return res;	
//	}
	
//	euclids by optimize  Overall, the time complexity 
//	of the entire program is O(log(min(a, b))). 
	static int lcm(int a,int b) {
		return (a*b)/euclidsOptimizedgcd(a, b);
		
	}
	
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
		System.out.println(lcm(a, b));
		
		scan.close();
	}

}
