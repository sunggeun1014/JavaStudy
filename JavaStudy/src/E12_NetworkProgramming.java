import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class E12_NetworkProgramming {

	/*
		# 자바로 통신 가능한 프로그램 만들기
		
		- 서버 소켓은 소켓의 접속을 계속 기다린다.
		- 서버 소켓에 소켓이 접속되고 나면 양방향으로 통신이 가능하다.
		- 서로 원하는 데이터를 전송할 수 있다.
		- 상대방에게 전송하는 것이 Output이고 상대방으로부터 받는것이 Input이 된다.
		
		# 네트워크 기본지식
		
		- IP주소 : 0.0.0.0 ~ 255.255.255.255 사이의 번호로 이루어진 컴퓨터의 주소
		  ※ IP주소는 cmd -> ipconfig 명령어로 체크할 수 있다.
		- 프로토콜(Protocol) : 통신 규칙(TCP, UDP, SMTP, Telnet...)
		- 포트번호 : 하나의 컴퓨터에서 각 프로그램을 구분하기 위한 용도로 사용되는 번호
		  ※ 현재 컴퓨터에서 열려있는 포트 번호는 cmd -> netstat 명령어로 확인 할 수 있다.
		  
		# Socket
		
		- 두 컴퓨터가 통신을하기 위해 사용하는 클래스
		
		# ServerSocket
		
		- 만들어 놓고 소켓의 연결을 기다리기 위한 클래스
	*/
	
	public static void main(String[] args) {
		// 서버
		
		// 포트번호를 설정하며 서버소켓 인스턴스를 생성한다.
		try (
			// 소켓도 close()가 필요한 클래스이다.
			ServerSocket ss = new ServerSocket(9085); 
		) {
			System.out.println("우리 서버의 IP주소: " + ss.getLocalSocketAddress());
			System.out.println("우리 서버의 포트번호: " + ss.getLocalPort());
			
			int count = 0;
			while(true) {
				// 다른 소켓이 연결될때까지 프로그램을 멈추고 기다린다...
				// 연결되고나면 연결 정보를 담은 소켓을 리턴한다.
				System.out.println("다음 연결을 기다리는중...");
				Socket s = ss.accept();
				
				// 연결된 상대방(클라이언트)에게 데이터를 보낼 수 있는 통로를 꺼내온다.
				try (
					PrintStream out = new PrintStream(s.getOutputStream());
				) {
					out.println("서버 접속을 환영합니다!!");
					out.printf("당신은 %d번째 방문자입니다~!\n", ++count);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
}
