import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("first number");
//		int a = scan.nextInt();
//		System.out.println("Second number");
//		int b = scan.nextInt();
//		int c=a/b;
//		System.out.println(c);
		
		
		
		
//		double sal=5000.00;
//		sal +=sal*15/100;
//		System.out.println("Incremented Salary="+sal);
		
		
		
		
//		System.out.println("Connection established");
//		try
//		{
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Enter Numerator");
//			int a = scan.nextInt();
//			System.out.println("Enter Denominator");
//			int b = scan.nextInt();
//			int res=a/b;
//			System.out.println(res);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Give non-zero as denominator."+"Infinite soloution");
//		}
//		System.out.println("Connection Terminated");
		
		
		
		
		
		
		
//		System.out.println("Enter the size");
//		int size=scan.nextInt();
//		int arr[]=new int[size];
//		System.out.println("Enter the number");
//		int data=scan.nextInt();
//		System.out.println("enter the data where is inserted");
//		int index=scan.nextInt();
//		arr[index]=data;
//		System.out.println(arr[index]);
		
		
		
		
		
		System.out.println("Connection established");
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Numerator");
			int a = scan.nextInt();
			System.out.println("Enter Denominator");
			int b = scan.nextInt();
			int res=a/b;
			System.out.println(res);
			System.out.println("Enter the size");
			int size=scan.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the number");
			int data=scan.nextInt();
			System.out.println("enter the data where is inserted");
			int index=scan.nextInt();
			arr[index]=data;
			System.out.println(arr[index]);
		}
		
		catch(ArithmeticException a) {
			System.out.println("enter a non-zero denominator");
		}
		
		catch(NegativeArraySizeException b) {
			System.out.println("enter a positive size");
		}
		
		catch(InputMismatchException c) {
			System.out.println("enter the correct input");
		}
		
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("enter index within the limit");
		}
		
		catch(Exception e) {
			
			System.out.println("Invaild input");
		}
		
		System.out.println("connection terminated");
		
	}

}
