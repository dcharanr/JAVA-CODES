import java.util.Scanner;

public class concatenateStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		String concatenate=str1+str2;
		System.out.println(concatenate);
		scan.close();
	}

}
