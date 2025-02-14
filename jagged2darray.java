import java.util.Scanner;

public class jagged2darray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][] a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("class"+i+"student"+j);
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("The ages are: ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
