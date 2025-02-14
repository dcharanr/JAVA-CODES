import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		String res=isPalindrome(s);
		System.out.println(res);
		scanner.close();
	}
	public static String isPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return "Not Palindrome";
			}
		}
		return "Palindrome";
		
	}
	

}
