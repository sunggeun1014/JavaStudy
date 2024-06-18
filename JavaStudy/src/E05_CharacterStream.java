import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_CharacterStream {
	
	/*
		# InputStream/OutStream
		
		- byte 단위로 데이터를 입/출력하는 클래스
		- 쓸 때는 데이터를 byte 형태로 분해해서 써야한다.
		- 읽을 때는 읽은 byte를 합쳐서 데이터를 만들어서 써야한다.
		
		# Reader/Writer
		
		- char 단위로 데이터를 입/출력하는 클래스
		- 쓸 때는 알아서 char를 byte로 분해해준다 (직접 분해할 필요가 없다)
		- 읽을 때는 알아서 byte를 합쳐서 char 형태로 우리에게 제공해준다.
	 */
	public static void main(String[] args) {
		
		// Writer로 파일에 데이터를 쓸 때
		FileWriter out = null;
		try {
			out = new FileWriter("myfiles/test2.txt");
			
			// write() : 맨 뒤에 쓴다.
			out.write('한');
			out.write('글');
			out.write('\n');
			
			for (int i = 0; i < 100; i++) {
				out.write("Write로 문자열도 쓸 수 있습니다.\n");
			}
			
			// append() : 맨 뒤에 추가하는 느낌
			out.append("문자열도 잘 들어갑니다.\n");
			
			char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', '\n'};
			out.write(arr);
			out.write(arr, 2, 5); // char[]에서 원하는 만큼을 쓸 수 있다.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// finally에 close()를 하여 스트림이 안닫힐 확률을 없앨 수 있다.
			try {
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileReader in = null;
		try {
			in = new FileReader("myfiles/test2.txt");
			
			// 한 글자(char단위)씩 읽기. 더 일긍ㄹ게 없으면 -1을 반환
//			int ch;
//			int i = 0;
//			while((ch = in.read()) != - 1) {
//				// System.out.printf("%d번째 문자: %c\n", i++, ch);
//				System.out.print((char)ch);
//			}

			System.out.println("----------------------------------------------------------");
			// 여러 글자씩 읽기. 기본적으로는 읽은 문자의 개수를 반환, 읽을게 없으면 -1 반환
			// 버퍼를 사용해 print() 메서드를 호출하는 횟수가 줄어들어 성능이 향상될 수 있다.
			char[] buff = new char[100];
			int len;
			while((len = in.read(buff)) != -1) {
				// char[]을 읽어들인 길이 만큼만 문자열로 만들어야 한다.
				System.out.printf("%s(len:%d)\n", new String(buff, 0, len), len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
