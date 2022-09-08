package p06.filter_stream2;

import java.io.*;

public class PrintStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/tmp/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
		
	}

}
