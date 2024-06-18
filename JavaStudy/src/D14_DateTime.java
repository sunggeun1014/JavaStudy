import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D14_DateTime {
	/*
		# java.time 패키지
		
		- Calendar의 여러가지 단점을 보완한 패키지
		- Calendar가 set(), add()를 통해 원본 인스턴스를 변경하는 것이 
		  큰 단점이라고 생각하여 새로운 시간 인스턴스를 만들어 반환하는 방식을 사용한다.
		- 날짜만 따로 다루는 클래스와 시간만 따로 다루는 클래스를 선택하여 사용할 수 있다.
		
		# java.time.LocalDateTime
			
		- 날짜와 시간을 모두 다루는 클래스
		
		# java.time.LocalDate
		
		- 날짜만 다루는 클래스
		
		# java.time.LoacalTime
		
		- 시간만 다루는 클래스
	*/
	
	public static void main(String[] args) {
		// now() : 현재 시간으로 인스턴스를 생성하여 반환한다.
		LocalDateTime now_dt = LocalDateTime.now();
		LocalDate now_d = LocalDate.now();
		LocalTime now_t = LocalTime.now();
		
		System.out.println(now_dt);
		System.out.println(now_d);
		System.out.println(now_dt);
		
		// plus, minus 메서드를 통해 해당 인스턴스를 기준으로 새로운 시간 인스턴스를 만들어낼 수 있다.
		// 캘린더처럼 원본을 훼손하는것이 아니라 새로운 인스턴스를 만들어 낸다.
		System.out.println(now_dt.plusDays(10));
		System.out.println(now_dt.plusHours(3));
		System.out.println(now_d.minusYears(5));
		System.out.println(now_d.plusMonths(20));
		
		// get 메서드를 원하는 단위의 값을 꺼낼 수 있다.
		System.out.println("현재 날짜 : " + now_dt.getDayOfMonth());
		System.out.println("10일 뒤의 날짜 : " + now_dt.plusDays(10).getDayOfMonth());
		System.out.println("현재 몇분? " + now_t.getMinute());
		
		// 요일을 꺼낼 때 DayOfWeek타입 인스턴스가 반환된다.
		System.out.println("요일? " + now_d.getDayOfWeek());
		
		// 요일 인스턴스를 활용할 수 있다.
		DayOfWeek dow = now_d.getDayOfWeek();
		
		// 요일.getDisplayName(길이, 언어) : 해당 요일의 이름을 꺼낸다.
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.JAPANESE));
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.JAPANESE));
		
		// 7가지 요일 인스턴스는 DayOfWeek 클래스의 상수로 만들어져 있다.
		System.out.println(DayOfWeek.MONDAY);
		System.out.println(DayOfWeek.TUESDAY);
		System.out.println(DayOfWeek.WEDNESDAY);
		System.out.println(DayOfWeek.THURSDAY);
		System.out.println(DayOfWeek.FRIDAY.getDisplayName(TextStyle.FULL, Locale.FRANCE));
		
		// getMonth()를 할 때도 Month클래스 인스턴스를 반환한다.
		System.out.println(now_dt.getMonth());
		
		Month thisMonth = now_d.getMonth();
		
		System.out.println("숫자값 : " + thisMonth.getValue());
		System.out.println("숫자값 : " + thisMonth.getDisplayName(TextStyle.FULL, Locale.FRANCE));
		
		// of() : 원하는 시간의 인스턴스를 생성하는 스태틱 메서드
		LocalDate date1 = LocalDate.of(2001, 5, 13);
		LocalTime time1 = LocalTime.of(14, 36);
		System.out.println(LocalDateTime.of(date1, time1));
		
		// with() : 해당 인스턴스의 특정 필드를 수정한 인스턴스를 반환한다
		LocalDate date2 = date1.withMonth(7);
		LocalDate date3 = date1.plusMonths(7);
		
		System.out.println(date2);
		System.out.println(date3);
		
		// 시간의 단위(TemporalField)는 ChronoField 클래스에 상수로 정의도어 있다.
		LocalTime time2 = time1.with(ChronoField.HOUR_OF_DAY, 20);
		LocalTime time3 = time1.withHour(20);
		
		System.out.println(time2);
		System.out.println(time3);
		
		
		// now(ZoneId) : 다른 국가의 날짜 및 시간을 확인할 때 사용한다.
		LocalDateTime usdt = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(usdt);
		
		// 사용 가능한 ZoneId 확인해보기
//		List<String> zoneIdList = new ArrayList<>(ZoneId.getAvailableZoneIds());
//		
//		Collections.sort(zoneIdList);
//		for (String zoneId : zoneIdList) {
//			System.out.println(zoneId);
//		}

		// TemporalAdjuster 인터페이스 : 특정 날짜를 만들어주는 기능을 하는 인터페이스
		// TemporalAdjusters 클래스 : TemporalAdjuster를 구현한 인스턴스들을 모아놓은 클래스
		// (시간조절기들 클래스에 시간조절기가 들어있다)
		LocalDate childrensDay = LocalDate.of(2024, 5, 5);
		
		LocalDate lastDayOfMay = childrensDay.withDayOfMonth(31);
		
		System.out.println(childrensDay);
		System.out.println(lastDayOfMay);
		
		// with 메서드와 함께
		// TemporalAdjusters의 여러 시간조절기들을 꺼내 쓸 수 있다
		System.out.println("어린이날이 포함된 달의 마지막 날 : " + childrensDay.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println("어린이날 다음달의 마지막 날짜 : " + childrensDay.plusMonths(1).with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println("저번주 수요일 인스턴스 : " + LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY)));
		System.out.println("이번 달의 2번째 목요일 : " + LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.THURSDAY)));
		
		
		
		
	}

}
