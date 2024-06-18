
public class E01_Exception {

	/*
	 * # 예외 (Exception)
	 * 
	   - 우리가 에러라고 생각했던 빨간 글씨들을 예외라고 부른다 - 프로그래머는 발생할 수 있는 예외를 미리 예상하고 대비해둘 수 있다. (예외
	   - 처리) - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러라고 부른다.
	   
	   # 예외 처리 (try-catch문)
	   - 예외가 발생할 수도 있는 코드를 try문 내부에 포함시킨다. - try문 내부에서 예외가 발생하지 않으면 정상적으로 작동한다. -
	   - try문 내부에서 예외가 발생하는 경우 발생한 예외에 대한 catch문으로 이동한다 - 예외가 발생했을때 예외처리가 되어있지 않은 경우
	   - 프로그램이 강제종료되지만 해당 예외에 대한 처리가 되어있는 경우 프로그램이 강제종료되지 않는다.
	   - 예외가 발생하여 해당 catch문에 도착할 때 발생한 예외에 대한 정보를 담고있는 인스턴스가 함께 도착한ㄷ,
	   = 예외 처리를 하지 않았을 때의 기본 동작은 e.printStackTrace() 후 강제 종료한다.
	   
	   # finally
	   
	   - try문 내부에서 예외가 발생하던 안하던 무조건 실행하게 되는 문법
	 */
	public static void main(String[] args) {

		try {
			int size = 10 / 0; // 발생 가능한 예외1
			int[] arr = new int[size];
			System.out.println(arr[-1]); // 발생 가능한 예외2
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 잘못된 숫자입니다");
		} catch (java.lang.ArithmeticException e) {
			// 예외가 발생했을 당시의 스택 상황을 출력해주는 메서드 (예외처리 기본 동작)
			e.printStackTrace();
			// 프로그램을 강제로 종료한다 (예외처리 기본 동작2)
			// System.exit(-1);
		}
		// 스택(프로그램에서 함수 호출 순서를 기억하기 위한 자료구조)
		try {
			plus(10);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			int[] nums = new int[3];
			nums[(int)(Math.random() * 5)] = 7;
		} catch (Exception e) {
			// Exception은 모든 예외객체의 조상 클래스이기 때문에
			// 모든 예외가 이 catch문으로 도착할 수 있다.
			System.out.println("예외가 발생했습니다!");
		} finally {
			// try문 내부에서의 예외 발생 여부와 관계없이 무조건 실행하고 싶은 코드를 finally에 적는다.
			System.out.println(" /)/)");
			System.out.println("( ..)");
			System.out.println("( >$");
		}
		
		System.out.println("프로그램이 정상 종료되었습니다.");

		
	}
	
	public static int plus(int a) {
		return plus2(a + 10);
	}
	
	public static int plus2(int a) {
		return plus3(a + 10);
	}
	
	public static int plus3(int a) {
		return a / 10;
	}
}
