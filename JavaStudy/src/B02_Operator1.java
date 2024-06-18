
public class B02_Operator1 {

	/*
	 	# 연산자 (Operator)
	 	
	 	 - 계산할 때 값과 함께 사용하는 것
	 	 - +, -, *, /, >, <, >=, ...
	 	
	 	# 산술 연산자
	 	
	 	 + : 더하기
	 	 - : 빼기
	 	 * : 곱하기
	 	 / : 나누기 (※ 정수로 나눌 때와 실수로 나눌 때의 결과가 다름)
	 	 % : 나머지
	*/
	public static void main(String[] args) {
		int a = 15, b = 7;
		double c = 7.0;
		
		System.out.printf("a + b: %d\n", a + b);
		System.out.printf("a - b: %d\n", a - b);
		System.out.printf("a * b: %d\n", a * b);
		
		// 정수와 정수의 연산 => 정수
		// 정수와 실수의 연산 => 실수		
		System.out.println("a + b: " + (a + b));
		System.out.println("a + c: " + (a + c));
		System.out.println("a - b: " + (a - b));
		System.out.println("a - c: " + (a - c));
		System.out.println("a * b: " + a * b);
		System.out.println("a * c: " + a * c);
		System.out.println("(정수끼리의 나누기) a / b: " + a / b);
		System.out.println("(정수와 실수 나누기) a / c: " + a / c);
		System.out.println("a % b: " + a % b);
		
		// Math.abs(x) : x의 절대값을 구하는 함수
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		// Math.round(x) : x를 소수 첫째 자리에서 반올림해주는 함수
		System.out.println(Math.round(1.55));
		
		// Math.ceil(x) : x를 소수 첫째 자리에서 올림해주는 함수
		System.out.println(Math.ceil(1.11));
		
		// Math.floor(x) : x를 소수 첫째 자리에서 내림해주는 함수
		System.out.println(Math.floor(1.99));
		
		
		// <연습> 10.34567을 소수 3번째 자리에서 내림한 결과를 출력해보세요		
		double avg = 10.34567;
		
		// (1) 10.34567을 1034.567로 만든다 
		//     (반올림 또는 올림 또는 내림 하고 싶은 숫자를 소수 첫번째 자리로 만든다)
		System.out.println(avg * 100);
		
		// (2) 내림을 한다
		System.out.println(Math.floor(avg * 100));
		
		// (3) 아까 100을 곱했으니까 다시 100.0으로 나눠서 원래대로 돌려준다
		System.out.println(Math.floor(avg * 100) / 100.0);
		
		// Math.pow(x, y) : x의 y제곱을 구하는 함수
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.pow(2, 9));
		
		// Math.sqrt(x) : x의 제곱근을 구하는 함수
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(48));
		System.out.println(Math.sqrt(9));
		
		// Math.max(x, y) : 두 값 중 더 큰 값을 구하는 함수
		System.out.println(Math.max(-3, 99));		
		
		// Math.min(x, y) : 두 값 중 더 작은 값을 구하는 함수
		System.out.println(Math.min(-3, 99));
	}
	
}




