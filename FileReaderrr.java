import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderrr {

	public static void main(String[] args) {
		
		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
		FileReader reader =null;
		try {
			reader = new FileReader(path);
			int c=reader.read();
			
			while(c!=-1) {
				System.out.print((char)c);
					c=reader.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException el) {
			el.printStackTrace();
	}
		
	}

}





//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileReaderrr {
//
//	public static void main(String[] args) {
//		
//		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
//		FileReader reader =null;
//		char[] ar=new char[130];
//		try {
//			reader = new FileReader(path);
////			System.out.println((char)reader.read(ar));
//			System.out.println(reader.read(ar));
//			System.out.println(ar);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException el) {
//			el.printStackTrace();
//	}
//		
//	}
//
//}
