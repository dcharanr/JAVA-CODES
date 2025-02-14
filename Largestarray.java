import java.util.Scanner;

public class Largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();		
		}
		Largest(arr);
		scan.close();
	}
	public static void Largest(int [] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
