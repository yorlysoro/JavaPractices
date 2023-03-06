package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBuffer {
	public void read() {
		try {
			FileReader inputFile = new FileReader("src/streams/streams.txt");
			BufferedReader myBuffer = new BufferedReader(inputFile);
			
			String line = "";
			while(line != null) {
				line = myBuffer.readLine();
				if(line != null)
					System.out.println(line);
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
