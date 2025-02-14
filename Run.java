import java.util.Scanner;

public class Run {
	public static String checkPrime(int n)
	{
//		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return "Notprime";
			}
		}
		return "prime";
		
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//Input 
		int n=scan.nextInt();
		
		//logic
		String res=checkPrime(n);
		System.out.println(res);
		scan.close();
		
	}

}
