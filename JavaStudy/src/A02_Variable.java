
public class A02_Variable {
	
	/*
	 	# 변수 (variable)
	 	
	 	- 프로그래밍 언어에서 데이터를 저장해 놓을 수 있는 공간
	 	- 변수 선언을 통해 메모리에 공간을 확보한 후 데이터를 해당 메모리에 저장해둘 수 있다	 	
	 	
	 	# 메모리 (RAM, 주기억장치)
	 	
	 	- 전기가 통하는 동안 데이터가 계속 유지되는 성질을 가지고 있는 저장 매체
	 	- 현재 진행 상황을 보관해놓는 용도로 사용하는 기억 장치
	 	
	 	# 하드드라이브 (보조기억장치)
	 	
	 	- 전기가 통하지 않더라도 데이터를 계속해서 보관해주는 성질을 가지고 있는 저장 매체
	 	- 주로 어떤 프로그램으로 '저장하기' 기능을 수행했을 때 
	 	  보조기억 장치에 해당 데이터를 보관한다
	 	  
	 	# 변수의 선언 (declare)
	 	
	 	  타입 변수명;
	 	
	 	- 해당 변수에 저장할 데이터의 타입과 변수의 이름을 정하는 것
	 	- 변수에 저장할 데이터의 종류에 따라 빌려오는 메모리의 크기가 다르다	 
	 	
	 	# 대입 연산 (=)
	 	
	 	- 원래 알고있던 =의 의미 : 왼쪽의 값과 오른쪽의 값이 같다
	 	- 프로그래밍 언어에서 =의 의미 : 왼쪽의 변수에 오른쪽의 값을 넣어라 (대입)
	*/

	// 만약 main() 함수에 틀린점이 있다면 가장 최근에 성공했던 main을 대신 실행한다
	public static void main(String[] args) {
		
		// int : 해당 변수에는 정수 데이터만 저장하겠다
		int a = 10;
		int b = 8;
		
		// String : 해당 변수에는 문자열 데이터만 저장하겠다
		String message1 = "Hello!";
		
		System.out.println(100);		
		System.out.println(100 + 200);
		
		// println()에 값 뿐만 아니라 변수를 전달해 출력할 수도 있다
		System.out.println(a);
		System.out.println(b);
		System.out.println(a * b);
		System.out.println(message1);
		
		
		// 변수를 선언하고 사용하는 여러 방식들
		
		// (1) 선언만 하고 대입은 나중에 하는 방식
		// ※ 변수를 선언한 후에 값을 한번도 대입하지 않은 경우 해당 변수를 활용할 수 없다
		//   (초기화 하지 않은 변수는 사용할 수 없다)
		int com;		
		com = 17;		
		System.out.println(com);
		
		// (2) 선언과 동시에 초기화하는 방식
		int score = 0;
		System.out.println("점수: " + score);
		
		// (3) 한번에 같은 타입으로 여러 변수를 선언하기
		int user_score, com_score;
		String welcome, goodbye;
		
		user_score = 80;
		com_score = 78;
		
		welcome = "어서오세요~";
		goodbye = "안녕히가세요~";
		
		System.out.println("사용자 점수는 " + user_score + "점이고, 컴퓨터 점수는 "
				+ com_score + "점입니다.");		
		System.out.println("현재 설정된 환영 메세지: " + welcome);
		System.out.println("현재 설정된 퇴장 메세지: " + goodbye);
		
		// (4) 한번에 변수 여러개 선언과 동시에 대입
		String food1 = "고기", food2 = "야채", food3 = "과일";
		int width = 33, height = 98;
		
		System.out.println(food1);
		System.out.println(food2);
		System.out.println(food3);
		
		System.out.println("너비: " + width + ", 높이: " + height);
		System.out.println("넓이: " + width * height);
		
		// ※ 같은 {} 내부에서 위에서 선언했던 변수명으로 다시 선언할 수 없다
		// int com; // Duplicate local variable com
	}
	
}





