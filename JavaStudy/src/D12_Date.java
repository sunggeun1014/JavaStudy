import java.util.Date;

public class D12_Date {
	
	/*
		# java.util.Date
		
		- 시간 및 날짜 정보를 다루는 클래스
		- 오래된 클래스이기 때문에 시간 정보 데이터 보관용으로만 사용하고 메서드는 잘 사용하지 않는다.
	 */
	
	public static void main(String[] args) {
		// 기본 생성자로 인스턴스 생성시 현재 시간이 나온다.
		Date now = new Date();
		
		System.out.println(now);
		
		// long타입 값을 전달하여 인스턴스 생성 시 원하는 시간으로 설정할 수 있다.
		// (1970년 1월 1일을 기준으로 시간을 설정할 수 있다, - 유닉스 타임)
		Date d1 = new Date(-1001);
		System.out.println(d1);
		
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println("sdfa");
		System.out.println(d2);
		
		// System.currentTimeMillis() : 현재 시간의 유닉스 타임을 long타입으로 꺼내는 메서드
		// ※ Unix Time - 1970년 1월 1일 오전 9시 이후로 시간이 얼마나 흘렀는지를 밀리초(1/1000로) 센 것
		System.out.println("1970년 이후로 흐른 시간 : " + System.currentTimeMillis() / 1000 + "초");
		
		// 원하는 날짜로 시간을 생성하는 기능이 있지만 더 이상의 업데이트를 해주지 않는다 (지원 중단)
		Date d3 =  new Date(2002, 5, 5);
		System.out.println(d3);
		
		now = new Date();
		Date onceOpneATime = new Date(2000);
		System.out.println(onceOpneATime);
		// date.after(anotherDate)
		// date.before(anotherDate)
		// => 두 시점을 비교해 어떤 시점이 더 뒤인지 알 수 있다. 
		System.out.println("now가 onceOpenATime보다 이후의 시점이니? " + now.after(onceOpneATime));
		System.out.println("now가 onceOpenATime보다 이전의 시점이니? " + now.before(onceOpneATime));
	
		// getTime() : 인스턴스로부터 해당 시간의 유닉스 타임을 꺼낼 수 있다.
		System.out.println(now.getTime());
		System.out.println(onceOpneATime.getTime());
		
		// setTime(unixTime) : 유닉스 타임을 전달해 인스턴스의 시간을 변경한다
		now.setTime(10000000L);
		System.out.println(now);
		
		// 다양한 getter들이 존재하지만 모두 지원 중단되어서 별로 사용되지는 않는다.
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getDay());
	}

}
