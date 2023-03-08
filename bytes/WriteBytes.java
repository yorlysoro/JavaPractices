package bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {
	
	public static void write(int data_file[]) {
		try {
			FileOutputStream new_file = new FileOutputStream("src/bytes/new_img.jpg");
			for(int data_byte: data_file) {
				new_file.write(data_byte);
			}
			new_file.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
