import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class E12_Network2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try (
			// 소켓은 인스턴스 생성시 접속할 IP주소와 포트번호가 필요하다.
			// 소켓 생성시 서버가 올바르다면 접속이 완료된다.	
			Socket s = new Socket("192.168.0.16", 9090);
		) {
			try (
				PrintStream out = new PrintStream(s.getOutputStream());
				BufferedInputStream in = new BufferedInputStream(s.getInputStream());
			) {
				System.out.println(new String(in.readAllBytes()));
				while(true) {
					System.out.print("> ");
					out.println(sc.nextLine());
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
