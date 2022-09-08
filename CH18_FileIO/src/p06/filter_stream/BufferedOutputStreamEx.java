package p06.filter_stream;

import java.io.*;

/*
	BufferedOutput을 사용했을 때와 사용하지 않았을 때 차이가 많이 남..
	BufferedOutput 사용했을 때가 시간이 더 적게 걸림
*/
public class BufferedOutputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("C:/house.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/tmp/house.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("BufferedOutput 사용하지 않았을 때 : " + (end - start) + "ms");

		
		fis = new FileInputStream("C:/house.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/tmp/house.jpg");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();
		bis.close();
		fis.close();
		
		System.out.println("BufferedOutput 사용했을 때 : " + (end - start) + "ms");
		
	}

}
