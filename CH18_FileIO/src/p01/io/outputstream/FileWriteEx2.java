package p01.io.outputstream;

import java.io.*;

public class FileWriteEx2 {
	
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/tmp/test.txt");
		byte[] data = "ABCDE".getBytes();
		
//		os.write(data, 1, 2);	// data의 index가 1부터 2개(2까지) write
		os.write(data);
		
		os.flush();
		os.close();
	}
}
