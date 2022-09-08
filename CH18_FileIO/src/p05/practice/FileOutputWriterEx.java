package p05.practice;

import java.io.*;

/*
	new FileWriter(File file, boolean append) 
	- append가 true이면 기존의 파일 내용을 삭제하지 않고, 끝에 새로운 내용 추가
	- false 이면 기존의 파일에 있는 내용 모두 삭제하고 새로운 내용을 추가함.
*/
public class FileOutputWriterEx {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/tmp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter는 한글로 된 \r\n");
		fw.write("문자열을 바로 출력할 수 있습니다. \r\n");
		
		fw.flush();
		fw.close();
		
		System.out.println("file.txt 파일에 저장되었습니다.");
		
	}

}
