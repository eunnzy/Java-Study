package p03.system_class;

import java.io.*;

/*
	System.err : 개발자가 console 창에 error 메세지를 보여줄 때 사용
				 => 빨간글씨로 출력됨.
*/
public class SystemOutEx {

	public static void main(String[] args) throws IOException{
		OutputStream os = System.out;	// promotion
		
		for(byte b=48; b<58; b++) {		// ascii code 48 : 0, ascii code 57 : 9 => 0 ~ 9까지 write
			os.write(b);
		}
		os.write(10);	// 0x0A (ascii code : 10) : line Feed (한줄 띄기)
		
		for(byte b=97; b<123; b++) {	// ascii code 97 : a ascii code 122 : z => a ~ z까지 write
			os.write(b);
		}
		os.write(10);

		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
		System.out.println();
		
		// 실행시 빨간 글씨로 화면에 출력이 됨
		System.err.println("System error 사용");
		
	}
	

}
