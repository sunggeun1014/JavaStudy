import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class E10_Buffered {
	/*
		# Buffered
		
		- 데이터를 하나씩 전송하는 것이 아니라 모아서 한번에 전송하는 기능을 제공하는 클래스
		- 앞에 Buffered가 붙은 클래스를 사용하면 알아서 버퍼 방식이 적용된다
		- BufferedReader/Writer : 버퍼 기능 + char 단위 입출력
		- BufferedInputStream/OutputStream : 버퍼 기능 + byte 단위 입출력
		- InputStreamReader : byte단위의 스트림을 char단위로 업그레이드 해주는 클래스
	 */
	public static void main(String[] args) {
		File emailFile = new File("myfiles/emails.txt");
		// 직접 구현한 번퍼 기능
		long start, end;
		// 한글자씩 출력할 때의 속도
		start = System.currentTimeMillis();
		try (
			FileReader in = new FileReader(emailFile);
		) {
			int ch;
			
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		
		long time1 = end - start;
		
		start = System.currentTimeMillis();
		try (
			FileReader in = new FileReader(emailFile);
		) {
			char[] buff = new char[2048];
			int len;
			
			while((len = in.read(buff)) != -1) {
				System.out.print(new String(buff, 0, len));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time2 = end - start;
		
		start = System.currentTimeMillis();
		try (
			FileReader fin = new FileReader(emailFile);
			BufferedReader in = new BufferedReader(fin);
		) {
			// Buffered 스트림에는 한 줄씩 읽는 기능이 추가되어 있다.
			// 읽을것이 있으면 읽을 내용을 반환, 없으면 null을 반환
			String line;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		long time3 = end - start;
		
		System.out.println("걸린시간1: " + time1 + "ms");
		System.out.println("걸린시간2: " + time2 + "ms");
		System.out.println("걸린시간3: " + time3 + "ms");
		
		// Scnner 대신 Buffered 클래스를 사용하여 콘솔로부터 입력받기
		//(Scanner는 들어오는 문자에 대한 정규표현식 검사를 하기 때문에 속도가 훨씬 느리다
		try (
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader bin = new BufferedReader(in);
		) {
			while(true) {
				System.out.print(">> ");
				if(bin.readLine().toLowerCase().equals("exit")) {
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
