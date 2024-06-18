
public class A04_VariableNaming {

	/*
	 	# 우리가 변수를 사용하는 이유
	 	
	 	1. 코드의 가독성을 높일 수 있다
	 	2. 여러곳에서 사용되는 값을 한번에 변경할 수 있다 (값을 재사용하기 편해진다)
	 	
	 	# 변수의 작명 규칙 (권장사항)
	 	
	 	1. 두 단어 이상을 이어붙여 사용할 때 _를 사용한다
	 	   (C언어 스타일, snake_case)
	 	   
	 	   ex> apple_qty, apple_price, minsu_age
	 	
	 	2. 두 단어 이상을 이어붙여 사용할 때 대문자를 활용한다
	 	   (Java 스타일, camelCase)
	 	   
	 	   ex> appleQty, applePrice, minsuAge
	 	   
	 	3. 변수명 첫 글자는 알파벳 소문자를 사용해야 한다
	 	   (첫 글자가 대문자인 경우는 암묵적으로 클래스로 간주한다) 
	 	   
	 	   ex> Apple(클래스로 간주), apple(변수로 간주)
	 	
	 	4. 프로그램이 종료될때까지 값이 절대로 변하지 않을 값은 모두 대문자를 사용한다
	 	   (상수를 저장하는 변수명은 모두 대문자로 표기한다)
	 	   
	 	   ex> PI, APPLE_PRICE, WIN_SCORE
	 	   
	 	5. 패키지명은 모두 소문자를 사용한다
	 	
	 	   ex> Quiz(클래스), quiz(패키지로 간주)
	 	
	 	6. 해당 변수에 들어있는 값이 무엇인지 쉽게 파악할 수 있는 이름을 사용해야 한다
	 	
	 	   ex> a1, a2, a3...(x)
	 	   
	 	# 변수의 작명 규칙 (필수사항, 지키지 않으면 컴파일 불가능)
	 	
	 	1. 변수의 첫 번째 글자에는 숫자를 사용할 수 없다	 		 	
	 	   ex> 1st, 2nd, 3rd (x)
	 	   
	 	2. 변수명 사이에는 공백을 사용할 수 없다
	 	
	 	3. 특수문자는 _와 $만 사용할 수 있다
	 	   ex> $uper, __apple (o)
	 	   
	 	4. 이미 자바에서 사용하고 있는 키워드들은 변수명으로 사용할 수 없다
	 	   (Eclipse에서 보라색으로 표시되는 키워드들)	 	   
	 	   ex> public, static, void, int, double, ... (x)
	*/
	public static void main(String[] args) {		
		int apple_qty = 15;
		int apple_price = 433;
		double apple_weight = 113.37;

		System.out.println("사과의 개수: " + apple_qty);
		System.out.println("사과의 개당 가격: " + apple_price);
		System.out.println("사과의 총 가격(원): " + apple_qty * apple_price + "원");
		System.out.println("사과의 총 무게(g): " + apple_qty * apple_weight + "g");
	}
	
}









