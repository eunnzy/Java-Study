package p03.system_class;

import java.io.*;

public class SystemInEx2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		byte[] data = new byte[100];
		System.out.print("이름 : " );
		int nameBytes = is.read(data);
		String name = new String(data, 0, nameBytes-2);		// -2하는 이유 : 이름을 입력하고 enter key(2bytes 차지)를 침 
		
		System.out.print("하고 싶은 말 : ");
		int commentBytes = is.read(data);
		String comment = new String(data, 0, commentBytes-2);

		System.out.println("입력한 이름 : " + name);
		System.out.println("입력 하고 싶은 말 : " + comment);
		
	}

}
