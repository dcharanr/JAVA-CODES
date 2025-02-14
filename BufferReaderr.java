import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderr {

	public static void main(String[] args) {
		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
		FileReader reader =null;
		BufferedReader reader2=null;
		try {
			reader = new FileReader(path);
			reader2 = new BufferedReader(reader);
			
			String line=reader2.readLine();
			int count=0;
			int sum=0;
			
			while(line!=null) {
				System.out.println(line);
				count++;
				int l=line.length();
				sum +=l;
				line=reader2.readLine();
				
			}
			System.out.println(count);
			System.out.println(sum);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException el) {
			el.printStackTrace();
		}
		
	}

}
