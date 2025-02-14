import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Scenario1 {

	public static void main(String[] args) {
		
		String path1="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\name.txt";
		String path2="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\phone.txt";
		String path3="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\phone_book.txt";
		
		FileReader reader=null;
		BufferedReader reader1=null;
		FileReader reader2=null;
		BufferedReader reader3=null;
		FileWriter writer=null;
		
		try {
			reader = new FileReader(path1);
			reader1 = new BufferedReader(reader);
			reader2 = new FileReader(path2);
			reader3 = new BufferedReader(reader2);
			writer = new FileWriter(path3);
			String name=reader1.readLine();
			String phone=reader3.readLine();
			while(name!=null && phone!=null) {
				writer.write(name+" : "+phone+"\n");
				name=reader1.readLine();
				phone=reader3.readLine();
			}
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
