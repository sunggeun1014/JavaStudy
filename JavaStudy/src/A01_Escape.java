
public class A01_Escape {

	/*
	 	# Escape 문자
	 	
	 	- \와 합쳐져서 특수한 기능을 가지는 문자
	 	- 소스 코드에 그냥 사용하기에는 문제가 있는 문자들을 표현하기 위한 방식
	 	- \와 바로 뒤에 나오는 하나의 문자가 합쳐져서 특수한 기능을 한다
	 	- \와 하나의 문자를 합쳐 두 문자가 되었지만 하나의 문자로 인식된다 
	*/	
	public static void main(String[] args) {

		// \n : 줄 바꿈의 기능을 가진 이스케이프 문자
		System.out.println("어서오세요! 환영합니다!!");
		System.out.println("어서\n오세요! 환영합니다!!");
		
		// \t : Tab키의 기능을 가진 이스케이프 문자
		//      Tab키는 그냥 사용해도 되지만, 일반 공백과 구분이 힘들어 
		//      \t를 적는 편이 직관적이다
		System.out.println("어서	오세요!	환영합니다!!");
		System.out.println("어서\t오세요!\t환영합니다!!");
		System.out.println("직원\t전화번호\t\t나이\t직급");
		System.out.println("김철수\t010-1234-1234\t25\t사원");
		System.out.println("김민수\t010-1234-1234\t26\t대리");
		System.out.println("김영수\t010-1234-1234\t27\t과장");
		
		// \\ : 그냥 역슬래시를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("C:\\Program Files\\Java");
		
		// \" : 그냥 "를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("그러자 그가 말했습니다. \"나는 못해요.\"");
		
		// \' : 그냥 '를 출력하고 싶을 때 사용하는 이스케이프 문자
		
		// "" 사이에서는 ''를 별 문제없이 사용할 수 있다
		System.out.println("오늘 저녁으로는 '치킨'을 먹어야겠다.");
		System.out.println("오늘 저녁으로는 \'치킨\'을 먹어야겠다.");
		
		// 자바에서는 문자 타입으로 작은따옴표를 사용하고 싶을 때만 사용하게 된다
		System.out.println('\'');
		
		// 이스케이프 문자는 두 문자가 합쳐서 하나의 문자이기 때문에
		// ''로 사용할 수 있다
		System.out.println('\n');
		System.out.println('\t');
		System.out.println(' '); // 공백도 문자다 (문자 번호 32번)
	}	
	
}






