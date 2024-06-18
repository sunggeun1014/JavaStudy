
public class B03_Operator2 {

	/*
		# 비교 연산자
		
	 	 - 두 값의 크기를 비교하는 연산
	 	 - 비교 연산의 결과는 항상 참(true) 또는 거짓(false)이다
	 	   (비교 연산의 결과는 boolean 타입이다)
	 	 - 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 진행한다 
	 	 
	 	# 논리 연산자
	 	
	 	 - boolean 값으로 연산하는 연산자
	 	 - && : 두 값이 모두 true일 때 true (AND)
	 	 - || : 두 값 중 하나만 true여도 true (OR)
	 	 - ! : true면 false, false면 true (NOT)
	*/
	public static void main(String[] args) {
		int a = 10, b = 15;
		
		System.out.println(a > b); 	// > : 왼쪽이 크면 true
		System.out.println(a < b);	// < : 오른쪽이 크면 true
		System.out.println(a >= b); // >= : 왼쪽이 크거나 두 값이 같으면 true
		System.out.println(a <= b); // <= : 오른쪽이 크거나 두 값이 같으면 true
		System.out.println(a == b); // == : 두 값이 같으면 true
		System.out.println(a != b); // != : 두 값이 다르면 true
		
		// 산술 연산을 먼저 진행하기 때문에 굳이 소괄호가 필요 없다
		System.out.println(a + b > a * b);
		
		System.out.println("#### AND연산 ####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println();
		
		System.out.println("#### OR연산 ####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println();
		
		System.out.println("#### NOT연산 ####");
		System.out.println("!true: " + !true);
		System.out.println("!false: " + !false);
		System.out.println();
		
		// true, false 자리에 비교 연산을 넣어서 사용할 수 있다
		System.out.println(a > 0 && b == -10);
	} 
	
}




