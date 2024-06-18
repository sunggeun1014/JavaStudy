
// 주석 : 프로그램에 영향을 미치지 않는 텍스트

/*
 	여러 줄을 
 	주석 처리하고 싶을 때
 	
 	# 실수로 창을 닫았을 때 	
 	Window -> Show View에서 다시 열 수 있다
*/

// Ctrl + [+,-] : 글자 크기 조절
// Ctrl + M : 현재 창 최대화
// Ctrl + W : 현재 창 닫기
// Ctrl + Shift + W : 현재 열린 모든 창 닫기

// F11 : 디버그 모드 (break point에서 정지하면서 실행)
// Ctrl + F11 : 빌드 (컴파일 + 실행)
// F2 : 에러(빨간줄) 또는 경고(노란줄)가 있을 때 원인 및 해결책 띄우기 

// ※ public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {

	/*
	 	# main() 함수
	 	
	 	- 자바에서 어떤 단어 뒤에 ()가 있으면 무조건 함수다
	 	- main() 함수는 프로그램의 시작 지점이다
	 	- 사용자가 프로그램을 실행하면 가장 먼저 main()을 찾아 실행한다
	 	- main() 함수가 종료되면 프로그램도 종료된다
	 	- main() 함수의 범위는 {}로 지정한다
	*/
	public static void main(String[] args) {
		// 프로그램의 시작
		
		/*
		 	# System.out.println() 함수
		 	
		 	- ()안에 전달한 데이터를 이 프로그램을 실행한 운영체제의 
		 	  콘솔 화면에 출력해주는 함수
		 	  
		 	# 콘솔
		 	
		 	- 각 운영체제에 기본으로 탑재되어 있는 글자만 나오는 화면
		 	- Command Line Interface (CLI <=> GUI) 
		 	
		 	# 세미콜론(;)
		 	
		 	- 한 명령어가 끝났음을 컴파일러에게 알리는 문자
		*/
		System.out.println("Hello, world!1");
		System.out.println("Hello, world!2");
		System.out.println("Hello, world!3");
		System.out.println("Hello, world!4");
		System.out.println("Hello, world!5");
		
		/*
		 	# System.out.println()의 ()안에 전달할 수 있는
		 	  자바 데이터의 종류 (자바의 리터럴)
		 	
		 	1. "" 사이에 적는 것 : 문자열(String), 문자를 여러개 적을 수 있다
		 	2. '' 사이에 적는 것 : 문자(Character), 문자를 하나만 적을 수 있다
		 	3. 그냥 정수를 적는 것 : 정수(Integer), 계산 가능
		 	4. 그냥 실수를 적는 것 : 실수(Float, Double), 계산 가능
		 	5. 그냥 true 또는 false를 적는 것 : 참/거짓 데이터
		 	6. 정수 뒤에 L을 적는 것 : 아주 큰 정수 (Long)
		*/
		
		// 1. 문자열 예시
		System.out.println("안녕하세요~!");
		System.out.println("안녕하세요~! 반갑습니다~~~~~~~~");
		System.out.println("3313"); // "" 사이에 적는 숫자는 문자열이다
		System.out.println("3313번 버스");
		
		// 그냥 숫자끼리는 계산이 되지만 문자열 숫자는 이어붙이기를 한다
		System.out.println(123 + 10); // 133
		System.out.println(123 + "10"); // 12310
		
		// 2. 문자 예시 (문자는 실제로는 숫자 값을 지니고 있다)
		System.out.println((int)'가'); // '가'는 44032번째 문자입니다.
		System.out.println('감');
		System.out.println('배');
		System.out.println('귤');
		System.out.println((int)'韓'); // '韓'은 38867번째 문자입니다. 
		System.out.println('漢');
		System.out.println((int)'A'); // 'A'은 65번째 문자입니다.
		System.out.println((int)'a'); // 'a'은 97번째 문자입니다.
		System.out.println('ㅁ');
		System.out.println('9');
				
		System.out.println(10 + 9); // 19
		System.out.println(10 + '9'); // 67?
		
		// 3. 정수 예시
		System.out.println(10);
		System.out.println(10 * 13); // * : 곱하기
		System.out.println(9999 + 123);
		System.out.println(9999 - 123);
		
		// 4. 실수 예시
		System.out.println(3.14 * 9);
		System.out.println(123.123 + 345.345);
		
		// ※ 정수와 실수는 계산이 자유롭지만 문자열은 +로 이어붙이기만 가능하다
		System.out.println("오늘의 메뉴: " + "오징어 볶음");
		// System.out.println("오늘의 메뉴: " * "순대");
		
		// ※ 문자열과 다른 모든 타입의 +는 이어붙이기를 한다
		System.out.println("할인율: " + 50 + '%');
		System.out.println("총 가격: " + 1500 + "원");
		
		System.out.println(10 + 3 * 8); 
		
		System.out.println("총 가격 : " + 1000 * 3 + "원");		
		System.out.println("총 가격 : " + (1000 + 1500) + "원");
		
		// 5. 참/거짓
		System.out.println(true);
		System.out.println(false);
		System.out.println("안경을 썼나요? " + true);
		
		// 6. 아주 큰 숫자
		
		// 숫자를 그냥 적을 때는 대략 22억까지 사용 가능
		System.out.println(1234567891); 
		
		// 더 큰 숫자를 쓰고 싶을 때는 뒤에 L을 붙이면 사용 가능
		System.out.println(1234567891234L); 
		
		// 프로그램의 끝
	}	
}






