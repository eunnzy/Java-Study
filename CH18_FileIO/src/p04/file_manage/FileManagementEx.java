package p04.file_manage;

import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class FileManagementEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/tmp/dir/sub/sub2");
		File file1 = new File("C:/tmp/file1.txt");
		File file2 = new File("C:/tmp/file2.txt");
		File file3 = new File("C:/tmp/file3.txt");
		
		if(dir.exists() == false) {
			dir.mkdirs();	// make directories의 약자 : mkdirs
		}
		
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		File tmp = new File("C:/tmp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd		a		HH:mm");
		File[] contents = tmp.listFiles();		// tmp directory에 있는 정보(directory와 file들)를 가져옴.
		
		System.out.println("날짜      시간      형태     크기      이름 ");
		System.out.println("--------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));		// 마지막으로 수정된 시간.
			if(file.isDirectory()) {	// file이 directory라면
				System.out.println("\t<DIR>\t\t " + file.getName());
			}else {		// file이라면 
				System.out.println("\t\t\t " + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		
		
		
	}

}
