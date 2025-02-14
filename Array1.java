import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int [] a=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the ages:"+i);
			a[i]=scan.nextInt();
		}
		System.out.println("The ages are: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
