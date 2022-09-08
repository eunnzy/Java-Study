package p08.network_basic2;

import java.io.IOException;
import java.net.*;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();	// 서버용 소켓 생성 (소켓: network상에서 데이터를 주고 받을 때 생성하는 instance)
//			 IP address : "localhost" (127.0.0.1), port: 5001
//			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				System.out.println("[연결 기다림]");
				// accept : client에서 connect 요청한 것에 대해 accept한다는 의미
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
			
		} catch (IOException e) {
			System.out.println("server socket생성 실패");
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				System.out.println("socket close error");
			}
		}
		
	}

}
