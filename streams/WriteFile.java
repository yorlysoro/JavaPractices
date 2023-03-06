package streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public void write() {
		String letter = "This is a test";
		try {
			FileWriter outputFile = new FileWriter("src/streams/new_file.txt");
			outputFile.write(letter);
			outputFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
