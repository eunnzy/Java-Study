package p05.practice;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("src/p05/practice/FileReaderEx");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while( (readCharNo = r.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		r.close();
	}

}
