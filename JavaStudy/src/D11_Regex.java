import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_Regex {

	/*
		# 정규표현식 (Regular Expression)
		
		- 문자열이 특정 패턴과 일치하는지 검사할 수 있는 표현식
		- 자바에만 있는 것이 아니라 언어에 종속되지 않은 공통의 규칙이다.
		
		# java.util.regex.Pattern
		
		- 자바에서 정규표현식을 활용하기 위한 클래스
		
		# java.util.regex.Matcher
		
		- 검사하고자 하는 문자열에 정규표현식을 적용한 결과를 담고있는 객체
		- 정규표현식에 해당하는 문자열의 위치 정보를 모두 담고 있다.
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, str) : 문자열이 정규표현식에 해당하는 문자열인지 검사하는 메서드
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치에 허용할 문자를 정의하는 정규표현식 문법
		System.out.println(Pattern.matches("s[l|h]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "skeep"));
		System.out.println(Pattern.matches("s[lh]e[ea]p", "sleap"));
		
		System.out.println(Pattern.matches("01[01679]-", "016-"));
		
		// \는 정규표현식에서도 특수한 기능을 지니고 있기 때문에 정규표현식에서 \\가 될 수 있도록 자바 문자열에서는 4개를 적어줘야 한다.
		System.out.println(Pattern.matches("C:[/\\\\]", "C:\\"));
		
		/*
			# [] 내부에 사용할 수 있는 문법들
			
			[abc] : a 또는 b 또는 c 허용
			[a|b|c] : a 또는 b또는 c허용
			[a-z] : a부터 z까지 모두 허용
			[a-zA-Z] : 모든 알파벳 허용
			[a-f&&d-i] : 두 조건을 모두 만족하는 경우만 허용
		 */
		System.out.println(Pattern.matches("[a-h]at", "hat"));
		System.out.println(Pattern.matches("[a-h]at", "cat"));
		System.out.println(Pattern.matches("[a-h]at", "aat"));
		System.out.println(Pattern.matches("[a-h]at", "Cat"));
		System.out.println(Pattern.matches("[a-hA-H]at", "Cat"));
		System.out.println(Pattern.matches("[a-c&&b-d]at", "bat"));
		System.out.println(Pattern.matches("[a-c&&b-d]at", "cat"));
		System.out.println(Pattern.matches("[a-c&&b-d]at", "dat"));
		
		/*
			# 한번에 여러 문자를 나타낼 수 있는 것들
			
			. : 그자에 모든 문자를 허용, [.] 또는 \.은 .만 허용하겠다는 뜻
			\d : 모든 숫자를 허용
			\D : 그 자리에 숫자를 제외한 모든 것을 허용
			\s : 그 자리에 모든 공백을 허용 (' ', \t, \n, ...)
			\S : 공백을 제외한 모든 것을 허용
			\w : 일반적인 문자들을 허용([a-zA-Z0-9_]와 같음)
			\W : \w를 제외한 모든 것을 허용
		 */
		
		System.out.println(Pattern.matches("...p", "skip"));
		System.out.println(Pattern.matches("...p", "ship"));
		System.out.println(Pattern.matches("...p", "#!@k"));
		System.out.println(Pattern.matches("\\...p", ".!@p"));
		System.out.println(Pattern.matches("[.]..p", ".!@p"));
		System.out.println(Pattern.matches("\\d\\d\\d", "12a"));
		System.out.println(Pattern.matches("\\D\\D", " b"));
		System.out.println(Pattern.matches("[\\da-z]..", "zip"));
		
		/*
			# 해당 패턴이 적용될 문자의 개수를 지정하기
			
			{n}    : {}앞의 패턴이 n개 반복되어야 한다.
			{n,m}  : {}앞의 패턴이 n개 이상 m개 이하 반복되어야 한다.
			{n,}   : {}앞의 패턴이 n개 이상 반복 되어야 한다
			?      : ? 앞의 패턴이 0번 또는 한 번 나와야 한다
			+      : + 앞의 패턴이 최소 한 번 이상 나와야 한다.
			*      : * 앞의 패턴이 0번 이상 나와야 한다
		 */
		
		System.out.println(Pattern.matches("\\d{6}", "123456"));
		System.out.println(Pattern.matches("\\d{6,8}", "12345678"));
		System.out.println(Pattern.matches("\\w{3,}", "ab"));
		System.out.println(Pattern.matches("[3-6]?", ""));
		System.out.println(Pattern.matches("[3-6]?", "5"));
		System.out.println(Pattern.matches("[1-9]+", "9999"));
		System.out.println(Pattern.matches("[ABCDF][+-]?", "A++"));
		System.out.println(Pattern.matches("[1-9]*", "123"));
		
		// 여태 배운 문법들을 소괄호로 묶어서 적용하는 것이 가능하다.
		System.out.println(Pattern.matches("([ABCDF][+-]?){2,}", "A+F"));
		
		// 연습1 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어보세요
		
		// 연습2 : 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어보세요
		
		// 연습3 : 해당 문자열이 IP주소인지 검사할 수 있는 정규표현식을 만들어보세요
		//        (0.0.0.0 ~ 255.255.255.255)
		
		System.out.println("핸드폰 번호 가능 여부 : " + isPhoneNumber("010-1234-1234"));
		System.out.println("이메일 사용 가능 여부 : " + isEmail("abc123aA@naver.ab.c"));
		System.out.println("IP 사용 가능 여부 : " + isIpAddress("10.0.1.2"));
		
		String text = "apple/kiwi/banana/mango/kiwi/kiwibird/kiwijuice/goldkiwi/redkiwi/redapple/greenapple";
		
		// Pattern.compile(regex) : 정규표현식 인스턴스를 하나 생성한다.
		Pattern kiwiPattern = Pattern.compile("(\\w*)(kiwi)(\\w*)");
		
		Matcher kiwiMatcher = kiwiPattern.matcher(text);
		
		// find()를 통해 다음 결과로 이동한다
		// 다음 결과가 있으면 true를 반환하고 없으면 false를 반환한다.
		System.out.println("-----------------------------------");
		while(kiwiMatcher.find()) {
			// group(0) : 정규표현식에 걸린 문자열 전체를 의미함
			// group(1) : 첫 번째 ()에 걸린 문자열을 의미함
			// group(2) : 두 번째 ()에 걸린 문자열을 의미함
			System.out.println("이번에 find()한것 : " + kiwiMatcher.group(1));
			System.out.println("이번에 find()한 시작 위치 : " + kiwiMatcher.start(2));
			System.out.println("이번에 find()한 마지막 위치 : " + kiwiMatcher.end(3));
			System.out.println("-----------------------------------");
		}
		
		// 연습 : 위의 text에서 apple을 모두 찾아서 kiwi로 교체한 문자열을 생성해 보세요
		String replaced = text.replaceAll("apple", "kiwi");
		System.out.println(replaced);
		
		
	}
	
	public static boolean isPhoneNumber(String str) {
		return Pattern.matches("010-?\\d{4}-?\\d{4}", str);
	}
	
	public static boolean isEmail(String str) {
		return Pattern.matches("[a-zA-Z\\d]+[@][a-zA-Z\\d]+[\\.][a-zA-Z\\d]+(\\.[a-zA-Z\\d]+)?", str);
	}
	
	public static boolean isIpAddress(String str) {
		return Pattern.matches("(([0-1]?\\d?\\d|2[0-4]\\d|25[0-5])[.]){3}([0-1]?[\\d]?[\\d]|2[0-4][\\d]|25[0-5])", str);
		//return Pattern.matches("((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])[.]){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])", str);
	}
}
