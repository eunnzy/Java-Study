package p01.io.outputstream;

import java.io.*;

/*
	FileOutputStream("write할 file 경로 지정")
	1. File을 새로 생성할 파일 경로(path) 지정
		-> 파일 경로에서 directory까지(폴더)는 존재해야함. ex) 아래 코드에서 tmp directory(폴더)는 존재해야함, 없으면 Exception 발생함.
		-> 파일 경로에서 write할 file은 없어도 됨. (만약에 없는 경우는 새로 생성해주어야 함.)
		-> 파일 경로에서 write할 file이 이미 존재한다면 기존 파일 내용 전체 삭제되고, 새로운 내용으로 update
	2. write() : file에 실제로 byte단위로 write
	3. flush() : 출력 버퍼에 있는 문자들 전체를 한번에 하드디스크의 file에 write.
	4. close() : 힙메모리의 FileOutputStream 인스턴스를 즉시 삭제
*/

public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/tmp/test.txt");	// C 드라이브의 tmp 디렉터리에 있는 test.txt파일
		byte[] data = "AAA".getBytes();		// getBytes method : String => byte[]로 변환
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
			
		os.flush();		// 버퍼에 잔류하는 데이터를 모두 출력하도록 (write 할 때 관습적으로 써주는 것이 좋음)
		os.close();
		
	}

}
