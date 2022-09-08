package p02.io.writer;

import java.io.*;

public class CharWriter {

	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("C:/tmp/test.txt");
		String str = "홍길동";
		char[] cbuf = "홍길동".toCharArray();
		
		w.write(str);
		
//		for(int i=0; i<cbuf.length; i++) {
//			w.write(cbuf[i]);
//		}
		
		w.flush();
		w.close();
	}

}
