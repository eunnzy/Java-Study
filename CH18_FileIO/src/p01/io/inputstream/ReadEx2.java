package p01.io.inputstream;

import java.io.*;

/*
	new String(readByte, 0, readByteNo) : readByte 바이트 배열을 문자열(String)으로 자동 변환 시켜줌.
	
*/
public class ReadEx2 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("src/p01/io/inputstream/test.txt");
			int readByteNo;
			byte[] readByte = new byte[3];
			String data = "";
			
			while(true) {
				try {
					// readByteNo : 실제로 읽은 byte 수
					readByteNo = is.read(readByte);	// 3bytes씩 한번에 읽어오기
					if(readByteNo == -1) {		// -1 : file에서 읽어올 데이터가 없는 경우
						break;
					}
					data += new String(readByte, 0, readByteNo);
//					System.out.println("readByte : " + data);		// 3bytes씩 읽어온 문자열을 출력해줌.
				} catch (IOException e) {	
					System.out.println("File read error");
				}
			}
			
			System.out.println("readByte : ");		// 읽은 데이터를 한번에 출력
			System.out.println(data);		// 읽은 데이터를 한번에 출력
			
			try {
				is.close();
			} catch (IOException e) {
				System.out.println("File close error");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File open error");
		}
		
	}
}
