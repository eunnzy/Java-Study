package p06.filter_stream;

import java.io.*;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/tmp/file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력스트림을 문자 출력 스트림으로 변환";
		writer.write(data);

		writer.flush();
		writer.close();
		fos.close();
		System.out.println("파일 저장이 끝났습니다.");
	}

}
