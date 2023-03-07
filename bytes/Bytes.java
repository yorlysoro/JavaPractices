package bytes;

import java.io.FileInputStream;
import java.io.IOException;

public class Bytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bytes[] = new int[1935244];
		try {
			FileInputStream read_file = new FileInputStream("src/bytes/pexels.jpg");
			boolean eof = false;
			int size_bytes = 0;
			while(!eof) {
				int input_byte = read_file.read();
				if(input_byte != -1) {
					bytes[size_bytes] = input_byte;
				}
				else {
					eof = true;
				}
				//System.out.println(bytes[size_bytes]);
				size_bytes++;
			}
			System.out.println(size_bytes);
			read_file.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
