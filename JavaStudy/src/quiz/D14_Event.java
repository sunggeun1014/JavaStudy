package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D14_Event {

	public static void main(String[] args) {
		printEventDays();
		
		
	}
	
	public static void printEventDays() {
		Calendar today = Calendar.getInstance();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		
		dateFormat.applyPattern("yyyy-MM-dd");
		
		for (int i = 0; i < 365; i++) {
			System.out.printf("[%s]일의 이벤트:  ", dateFormat.format(today.getTime()));
			
			boolean eventExist = false;
			
			// 매 월 18일
			if(today.get(Calendar.DAY_OF_MONTH) == 18) {
				System.out.print("1+1 이벤트");
				eventExist = true;
			}
			
			// 홀수번째 주 금요일
			if(today.get(Calendar.WEEK_OF_MONTH) % 2 == 1 && today.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
				if (eventExist) {
					System.out.print(", 20% 할인 이벤트");
				} else {
					System.out.print("20% 할인 이벤트");
				}
				eventExist = true;
			}
			
			if (today.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
				if(eventExist) {
					System.out.print(", 구매시 아메리카노 무료");
				}else {
					System.out.print("구매시 아메리카노 무료");
					eventExist = true;
				}
			}
			
			if(!eventExist) {
				System.out.print("이벤트 없음");
			}
			
			System.out.println();
			today.add(Calendar.DATE, 1);
		}
	}
}
