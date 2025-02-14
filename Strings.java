import java.util.Scanner;
import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("TAP ");
		sb.append("ACADEMY ");
		sb.append("GAMESJOSLING ");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.delete(2, 10));
		
	}

}


//String s1=new String("JAVA");
//String s2=new String("JAVA");
//
//if(s1==s2)
//{
//	System.out.println("ref are equal");
//}
//else
//{
//	System.out.println("ref are not equal");
//}
//if(s1.equals(s2))
//{
//	System.out.println("Values are equal");
//}
//else
//{
//	System.out.println("Values are not equal");
//}



//String s3=s1.concat(s2);
//String s4=s1.concat(s2);
//System.out.println(s4);
//
//if(s3==s4)
//{
//	System.out.println("ref are equal");
//}
//else
//{
//	System.out.println("ref are not equal");
//}
//if(s3.equals(s4))
//{
//	System.out.println("Values are equal");
//}
//else
//{
//	System.out.println("Values are not equal");
//}



//String s1="TAP";
//s1=s1.concat("ACADEMY");
//System.out.println(s1);




//stringttokinizer
//String s="JAVA PYTHON SQL AI";
//StringTokenizer st = new StringTokenizer(s);
//while(st.hasMoreTokens())
//{
//	System.out.println(st.nextToken());
//}