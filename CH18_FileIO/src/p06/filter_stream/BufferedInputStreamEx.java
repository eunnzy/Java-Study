package p06.filter_stream;

import java.io.*;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("입력 : ");
		String lineString = br.readLine();	// readLine : 한줄씩 읽기
		
		System.out.println("출력 : " + lineString);
	}

}
