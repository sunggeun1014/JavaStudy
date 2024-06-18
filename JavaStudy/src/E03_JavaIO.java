import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E03_JavaIO {

	/*
		# IO (Input/Output)
		
		- 데이터의 입력과 출력을 의미한다
		- 자바는 스트림이라는 개념을 통해 프로그램의 입/출력을 다룬다.
		- 프로그램으로 데이터가 들어오는 것을 입력(Input)이라고 한다.
		- 프로그램에서 계산되어 나가는 모든 데이터들을 출력(Output)이라고 한다.
		
		# Stream
		
		- 데이터들이 오고 가는 통로
		- 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 한다.
		- 데이터들이 프로그램에서 나가는 통로를 OutputStream이라고 한다.
		- 데이터가 Stream을 지나가기 위해서는 해당 데이터를 byte타입으로 변환해야 한다.
		  (byte 타입이 0과 1로 변환하기 가장 쉬운 형태이기 때문에)
	 */
	
	public static void main(String[] args) {
		try {
			// 파일로 데이터를 내보낼 수 있는 통로를 생성한다.
			// (저장매체(CD, USB, HDD, SSD)로 데이터를 내보낼 수 있는 통로를 생성한다.)
			FileOutputStream out = new FileOutputStream("myfiles/test.txt");
			
			try {
				out.write(65);
				out.write(66);
				out.write(67);
				out.write('\n');
				
				// "".getBytes() : 해당 인스턴스를 byte[]로 변환하여 변환한다.
				out.write("Hello, world!\n".getBytes());
				out.write("안녕하세요~\n".getBytes());
				
				// 다 사용한 통로는 반드시 닫아줘야 한다 (안닫아주면 메모리 누수 발생)
				
				// ※ 메모리 누수 : 프로그램이 오랫동안 켜져있는 경우 차지하는 메모리 용량이 점점 커지는 현상 (운영체제에 의해 강제종료 된다)
				out.close();
			} catch (IOException e) {
				e.printStackTrace(); // 통로로 입력하던 도중 발생한 예외
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 파일 통로 생성 도중 발생한 예외
		}
		
		System.out.println("프로그램이 실행되었습니다.");
	}
}
