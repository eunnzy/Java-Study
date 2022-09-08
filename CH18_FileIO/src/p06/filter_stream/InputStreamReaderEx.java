package p06.filter_stream;

import java.io.*;

/*
	InputStreamReader : inputstream 객체를 생성자 parameter로 받아서 입력된 byte 단위 데이터를 char 단위로 변환하는 class
	
*/
public class InputStreamReaderEx {
	
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;		// 콘솔에서 읽어옴.
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];

		while( (readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		reader.close();
		
		
	}	
}
