
public class D05_WrapperClass {
	/*
		# Wrapper Class
		
		- 각 기본형 타입에 대한 클래스 
		- 각 타입에 관련된 유용한 기능들이 해당 클래스에 정의도어 있다.
		
		# 기본형 (primitive type)
		 
		-byte, short, char, int, long, float, double, boolean
		 
		# 침조형 (references type)
		 
		- Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	
	public static void main(String[] args) {
		/*
			# 파싱 (Parsing)
			
			- 문자열을 해당 타입 값으로 변환하는 기능
			- 각 클래스마다의 parseXXX이 존재한다.
		*/
		
		String value = "88";
		
		// parseXXX(Str) : 문자열을 int 타입 값으로 만들어 반환
		int intValue = Integer.parseInt(value);

		// parseInt(str, radix) : 문자열을 해당 진법으로 해석한 값을 만들어 반환
		int intValue2 = Integer.parseInt(value, 16);

		System.out.println("88을 10진법으로 해석한 값 : " + intValue);
		System.out.println("88을 16진법으로 해석한 값 : " + intValue2);
		
		byte byteValue = Byte.parseByte(value);
		float floatValue = Float.parseFloat(value);
		double doubleValue = Double.parseDouble(value);
		
		/*
			# toString
			
			- 각 WrapperClass의 toString()은 해당 타입 값을
			  문자열로 변환하여 반환한다.
		 */
		
		// WrapperClass 인스턴스를 생성하는 방식 (생성자는 지원 만료됨)
		Integer i1 = new Integer(10);
		Integer i2 = Integer.valueOf(10);
		
		// 인스턴스 메서드 toString() : 우리가 알고있던 Ojbect의 메서드
		// (해당 인스턴스의 문자열 형태를 반환한다.) 
		String str1 = i2.toString();
		
		// 스테틱 메서드 toString(value) : 해당 타입 값으로 문자열 인스턴스를 생성하여 반환한다
		String str2 = Integer.toString(5555);
		String str3 = Integer.toString(5555, 2);
		
		System.out.println("5555를 10진법으로 해석한 문자열 : " + str2);
		System.out.println("5555를 2진법으로 해석한 문자열 : " + str3);
		
		// 각 타입과 관련된 상수들
		System.out.println("int타입은 몇 바이트? " + Integer.BYTES);
		System.out.println("double타입은 몇 바이트? " + Double.BYTES);
		System.out.println("int의 최대값은? " + Integer.MAX_VALUE);
		System.out.println("int의 최소값은? " + Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		// Character 타입의 기능들
		System.out.println("글자인가요? " + Character.isAlphabetic('#'));
		System.out.println("글자인가요? " + Character.isAlphabetic('1'));
		System.out.println("글자인가요? " + Character.isAlphabetic('a'));
		System.out.println("글자인가요? " + Character.isAlphabetic('A'));
		System.out.println("글자인가요? " + Character.isAlphabetic('한'));
		System.out.println("글자인가요? " + Character.isAlphabetic('+'));
		
		char ch = '한';
		
		System.out.println("대문자인가요? " + Character.isUpperCase(ch));
		System.out.println("소문자인가요? " + Character.isLowerCase(ch));
		System.out.println("대문자인가요? " + Character.isUpperCase('C'));
		System.out.println("소문자인가요? " + Character.isLowerCase('A'));
		
		System.out.println("공백인가요? " + Character.isWhitespace(ch));
		System.out.println("공백인가요? " + Character.isWhitespace('c'));
		System.out.println("공백인가요? " + Character.isWhitespace('\n'));
		System.out.println("공백인가요? " + Character.isWhitespace('\\'));
		
		System.out.println("숫자인가요? " + Character.isDigit('3'));
		System.out.println("숫자인가요? " + Character.isDigit('ㅁ'));
		System.out.println("숫자인가요? " + Character.isDigit('#'));
		
		// Character.getType(ch) : 해당 문자의 타입이 무엇인가
		// (타입 번호는 Character 클래스 내부에 상수로 선언되어 있다)
		System.out.println(Character.getType('a'));
		System.out.println(Character.getType('b'));
		System.out.println(Character.getType('한'));
		System.out.println(Character.getType('글'));
		System.out.println(Character.getType('$'));
		
		System.out.println("자바 변수의 맨 앞 문자로 활용할 수 있는 문자인가요? " + Character.isJavaIdentifierStart('3'));
		System.out.println("자바의 변수로 활요할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('3'));
		System.out.println("자바의 변수로 활요할 수 있는 문자인가요? " + Character.isJavaIdentifierPart(' '));
		System.out.println("자바의 변수로 활요할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('#'));
		System.out.println("자바의 변수로 활요할 수 있는 문자인가요? " + Character.isJavaIdentifierPart('$'));
		
		
	}
}
