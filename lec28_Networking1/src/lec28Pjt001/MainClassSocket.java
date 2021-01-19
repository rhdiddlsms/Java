package lec28Pjt001;

import java.io.IOException;
import java.net.Socket;
//클라이언트
public class MainClassSocket {

	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			//(도메인주소 , 포트번호)
			socket = new Socket("localhost", 9000);	//127.0.0.1
			System.out.println("서버 연결~~");
			System.out.println("socket: " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
