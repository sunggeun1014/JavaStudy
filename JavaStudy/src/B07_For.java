
public class B07_For {

	public static void main(String[] args) {

		for (int i = 0; i < 10; ++i) {
			System.out.println("Hello, world!" + i);
		}

		for (int i = 50; i > 0; --i) {
			System.out.println("i : " + i);
		}

		for (int i = 1; i < 10000; i *= 2) {
			System.out.println("i : " + i);
		}

		for (int i = 1; i < 10000; i *= 3) {
			System.out.println("i : " + i);
		}

		// <연습1> byte 타입의 모든 값을 최소값부터 최대값까지 출력해보세요
		for (int i = -128; i <= 127; ++i) {
			if(i == -128) {
				System.out.print("[" + i + ", ");
			}else if (i == 127) {
				System.out.print(i + "]\n");
			} else {
				System.out.print(i + ", ");
			}
		}

		// <연습2> char 타입의 모든 문자를 최소값부터 최대값까지 출력해보세요
		for (int i = 0; i <= 65535; i++) {
			System.out.printf("%d번째 문자: '%c'\n", i, i);
		}

		int a = 10;
		for(; a < 100;) {
			System.out.println("프로그램이 끝났습니다!" + ++a);
		}
		
	}
}
