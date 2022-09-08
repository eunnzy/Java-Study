package p02.io.reader;

import java.io.*;

/*
	FileReader : 유니코드 1문자 (영문자, 한글 모두 포함) 단위로 파일에서 데이터를 읽음
	
*/
public class CharacterReaderEx {

	public static void main(String[] args) throws IOException{
		Reader r = new FileReader("C:/tmp/test.txt");
		int readData;
		
		while(true) {
			readData = r.read();
			if(readData == -1) {
				break;
			}
			System.out.println((char) readData);
		}
		
		r.close();
		
	}

}
