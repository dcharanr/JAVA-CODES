import java.util.Scanner;

public class Array2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int [][]a=new int[2][5];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("Enter class"+i+"student"+j);
				a[i][j]=scan.nextInt();
			}
			System.out.println("The ages are: ");
			for(int i1=0;i1<2;i1++)
			{
				for(int j=0;j<5;j++)
				{
					System.out.print(a[i1][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
