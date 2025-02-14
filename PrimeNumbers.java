import java.util.Scanner;
public class PrimeNumbers {
	static void  sieveprintPrime(int n) {
		boolean [] prime=new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}
	
	//O(route n) more efficient than previous one
	//we can write squareroot by two ways 
	//1.i<=Math.sqrt(n);
	//2.i*i<=n;
	
//	static boolean isPrime(int n) {
//		if(n==1) {
//			return false;
//		}
//		if(n==2 || n==3) {
//			return true;
//		}
//		if(n%2==0 || n%3==0) {
//			return false;
//		}
//		for(int i=5;i*i<=n;i=i+6) {
//			if(n%i==0 || n%(i+2)==0) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	
//	//O(route n)
//	static boolean isPrime(int n) {
//		for(int i=2;i<=Math.sqrt(n);i++) {
//			if(n%i==0) {
//			return false;
//			}
//		}
//		return true;
//	}
	
//	O(n)
//	static boolean isPrime(int n) {
//		for(int i=2;i<=n/2;i++) {
//			if(n%i==0) {
//				return false;
//			}
//		}
//		return true;
//	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
//		System.out.println(isPrime(n));
		sieveprintPrime(n);
		scan.close();
	}

}