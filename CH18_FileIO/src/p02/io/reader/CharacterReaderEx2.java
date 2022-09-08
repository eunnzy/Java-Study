package p02.io.reader;

import java.io.*;

public class CharacterReaderEx2 {

	public static void main(String[] args) throws IOException {
		Reader r = new FileReader("C:/tmp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		
		while(true) {
			readCharNo = r.read(cbuf);
			if(readCharNo == -1) {
				break;
			}
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		r.close();
	}

}
