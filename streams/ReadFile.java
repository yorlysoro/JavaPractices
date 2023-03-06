package streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public void read() {
		try {
			FileReader inputFile = new FileReader("src/streams/streams.txt");
			int c = inputFile.read();
			while(c != -1) {
				char letter = (char)c;
				System.out.print(letter);
				c = inputFile.read();
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File Not Found!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
