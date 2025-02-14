import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter {

	public static void main(String[] args) {
		
		String path="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\data.txt";
		String path1="C:\\Users\\CharanCherry\\OneDrive\\文档\\PC Connect\\newData.txt";
		FileReader reader =null;
		FileWriter writer =null;
		try {
			reader = new FileReader(path);
			writer = new FileWriter(path1);
			int c=reader.read();
			
			while(c!=-1) {
				writer.write(c);
				c=reader.read();
			}
			writer.flush();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException el) {
			el.printStackTrace();
		}
	}

}
