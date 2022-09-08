package p06.string_methods;

import java.io.IOException;

/*
	System.in.read(byte)
	1. 키보드에서 byte[] 배열로 문자들을 읽어 bytes 배열에 집어 넣어줌 
	  - 키보드의 각 문자는 byte 단위로 저장됨.
	  - 한글인 경우는 1개문자당 3byte로 저장 (UTF-8에서는 한글 한 글자가 3글자로 변환)
	2. read method의 return 값은 읽어들인 총 byte 개수 
	  - 읽어들인 byte에는 enter key도 포함되어 있음 (enter key - 2 byte => \r, \n )
	3. new String(bytes, 0, readByteNo-2)에서 readByteNo-2를 한 이유 : enter key 제외 위함.
*/


public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);
		System.out.println("readByteNo : " + readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2);		// -2한 이유 : enter key 제외하고 byte 개수 
		System.out.println(str);
		
	}

}
