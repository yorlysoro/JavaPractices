package dirs_files;

import java.io.File;

public class CreateFileDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src"+ File.separator +"dirs_files"+ File.separator +"from_test");
		file.mkdir();
		
	}

}
