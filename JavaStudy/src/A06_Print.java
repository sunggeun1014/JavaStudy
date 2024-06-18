
public class A06_Print {

	/*
	  	# 콘솔에 출력하는 함수들
	  	
	  	1. println()
	  	
	  	 - ()안에 전달한 데이터를 콘솔에 출력하고 출력 맨 마지막에 \n을 추가한다
	  	 - println()은 데이터를 아무것도 전달하지 않으면 줄만 바꿔준다
	 
	    2. print()
	     
	     - ()안에 전달한 데이터를 콘솔에 출력한다
	     - 줄을 자동으로 바꿔주지 않는다
	     - 데이터를 아무것도 전달하지 않으면 사용할 수 없다
	     
	    3. printf()
	    
	     - print format
	     - 서식을 사용해 데이터를 출력할 수 있는 함수
	     - 출력하고 싶은 문자열의 형식을 먼저 지정한 후 
	       데이터가 들어가야 하는 자리에 데이터를 순서대로 채워서 사용한다 
	     - printf()는 줄을 자동으로 바꿔주지 않기 때문에 주의해야 한다
	     
	     * printf()에 사용할 수 있는 서식 문자의 종류
	     
	       %d : 해당 자리에 전달한 정수값을 10진수로 출력 (decimal)
	       %o : 해당 자리에 전달한 정수값을 8진수로 출력 (octal)
	       %x : 해당 자리에 전달한 정수값을 16진수로 출력, 알파벳을 소문자로 출력 (hexa)
	       %X : 해당 자리에 전달한 정수값을 16진수로 출력, 알파벳을 대문자로 출력
	       %f : 실수
	       %s : 문자열
	       %c : 문자
	       %% : 그냥 %를 출력하고 싶은 경우 (서식 문자의 Escape)
	       
	     * 서식 문자 옵션 - 서식 문자의 %와 문자 사이에 넣어서 사용
	     
	       1. %숫자d : 숫자만큼 자릿수를 확보하면서 출력한다
	       
	       2. %-숫자d : 숫자만큼 자릿수를 확보한 후 왼쪽 정렬하여 출력한다
	       
	       3. %0숫자d : 숫자만큼 자릿수를 확보한 후 빈자리에 0을 채워 출력
	       
	       4. %+d : 양수인 경우에도 부호를 출력해준다
	       
	       5. %.숫자f : 실수의 소수점 아래 자릿수를 설정할 수 있다 
	*/
	public static void main(String[] args) {
		
		// 소문자로 시작하는 타입들 - 기본형 타입
		// 대문자로 시작하는 타입들 - 참조형 타입
		
		double hello = 3.14;
		
		System.out.println("hello");
		System.out.println(hello);
		System.out.println(true);
		System.out.println(123 + 123);
		
		int year = 2024;
		int month = 4;
		int date = 18;
		int hour = 9;
		int minute = 38;
		int second = 45;
		
		// println()으로 출력하기 다소 불편한 경우
		System.out.println(year + "년 " + month + "월 " + date + "일 "
				+ hour + ":" + minute + ":" + second);
		
		// printf()를 사용하면 출력하기 편한 경우가 있다
		System.out.printf("%d년 %d월 %d일 %d:%d:%d\n", 
				year, month, date, hour, minute, second);

		System.out.printf("15를 10진수로 표현하면? %d\n", 15);
		System.out.printf("15를 8진수로 표현하면? %o\n", 15);
		System.out.printf("15를 16진수 소문자로 표현하면? %x\n", 15);
		System.out.printf("15를 16진수 대문자로 표현하면? %X\n", 15);
		
		System.out.printf("%f\n", 12.12345);
		System.out.printf("%s\n", "문자열");
		System.out.printf("%c등급\n", 'A');
		
		System.out.printf("%9s%9s%9s%9s\n", 
				"alice", "chloe", "erin", "jade");
		System.out.printf("%9d%9d%9d%9d\n", 10, 9033, 1285, 8818);
		
		System.out.println("------------------------------------------");
		
		System.out.printf("%-9s%-9s%-9s%-9s\n", 
				"alice", "chloe", "erin", "jade");
		System.out.printf("%-9d%-9d%-9d%-9d\n", 10, 9033, 1285, 8818);
		
		System.out.println("------------------------------------------");
		
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\n", 
				8, 9, 10, 11, 12);
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\n", 
				13, 14, 15, 16, 17);
		System.out.printf("%02d\t%02d\t%02d\t%02d\t%02d\n", 
				3, 1, 333, 20, 17);
		
		System.out.println("------------------------------------------");
		
		System.out.printf("오늘의 최고기온: %+6d℃\n", 13);
		System.out.printf("오늘의 최저기온: %+6d℃\n", -13);
		
		// %.숫자f로 자릿수를 제한 할 때 반올림이 발생한다
		System.out.printf("%.0f\t%.1f\t%.2f\t%.3f\t%.4f\n",
				1.56789, 1.56789, 1.56789, 1.56789, 1.56789);
	}
	
}







