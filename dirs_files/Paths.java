package dirs_files;

import java.io.File;

public class Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src"+ File.separator +"dirs_files");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		String[] list = file.list();
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			File f = new File(file.getAbsolutePath(), list[i]);
			if(f.isDirectory()) {
				String[] sub_directory = f.list();
				for(int j = 0; j < sub_directory.length; j++) {
					System.out.println(sub_directory[j]);
				}
			}
		}
		
	}

}
