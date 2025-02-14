import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterrr {

	public static void main(String[] args) {
		
		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
//		File file=new File(path);
		Scanner scan = new Scanner(System.in);
		FileWriter writer=null; 
		try {
			String s1=scan.nextLine();
			String s2=scan.nextLine();
			String s3=scan.nextLine();
			writer = new FileWriter(path,true);
			writer.write(s1+"\n");
			writer.write(s2+"\n");
			writer.write(s3+"\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			scan.close();
//			writer.close();
		}
	}

}





//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class FileWriterrr {
//
//	public static void main(String[] args) {
//		
//		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
//		File file=new File(path);
//		Scanner scan = new Scanner(System.in);
//		try {
//			String s1=scan.nextLine();
//			String s2=scan.nextLine();
//			String s3=scan.nextLine();
//			FileWriter writer = new FileWriter(file);
//			writer.write(s1+"\n");
//			writer.write(s2+"\n");
//			writer.write(s3+"\n");
//			writer.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}







//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileWriterrr {
//
//	public static void main(String[] args) {
//		
//		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
//		File file=new File(path);
//		try {
//			FileWriter writer = new FileWriter(file);
//			writer.write("Hello World");
//			writer.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
