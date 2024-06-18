package quiz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D13_GraduateDay {
	
	final static String[] HOLIDAY = {"01.01", "02.09", "02.10", "02.11", "02.12", "03.01", "04.10", "05.05", "05.06", "05.15", "06.06", "08.15", "09.16", "09.17", "09.18", "10.03", "10.09", "12.25"}; 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE");
		List<Info> holidays = new ArrayList<>();
		
		System.out.print("수업 시작 날짜 입력 >> ");
		String[] inputDay = scan.next().split("\\.");
		
		System.out.print("수업 진행 일수 입력 >> ");
		int progressDay = scan.nextInt();
		
		calendar.set(Calendar.YEAR, Integer.parseInt(inputDay[0]));
		calendar.set(Calendar.MONTH, Integer.parseInt(inputDay[1]) - 1);
		calendar.set(Calendar.DATE, Integer.parseInt(inputDay[2]));
		
		for (int i = 0; i < progressDay; i++) {
			calendar.add(Calendar.DATE, 1);
			int currDay = calendar.get(Calendar.DAY_OF_WEEK);
			
			if(currDay == 1 || currDay == 7) {
				holidays.add(new Info(sdf.format(calendar.getTime()))); 
				i--;
				continue;
			}
			
			for (String day : HOLIDAY) {
				String[] arrDay = day.split("\\.");
				
				if(calendar.get(Calendar.MONTH) + 1 == Integer.parseInt(arrDay[0]) && calendar.get(Calendar.DATE) == Integer.parseInt(arrDay[1])) {
					holidays.add(new Info(sdf.format(calendar.getTime())));
					i--;
					break;
				}
			}
		}
		
		System.out.println("수업 종료 날짜 : " + sdf.format(calendar.getTime()));
		System.out.println("휴일 : " + holidays);
	}
	
	public static class Info {
		String year;
		String month;
		String day;
		String dayOfWeek;
		
		public Info(String day) {
			Pattern pattern = Pattern.compile("(\\d+)-(\\d+)-(\\d+) ([가-힣]+)");
			Matcher matcher = pattern.matcher(day);
			
			matcher.find();
			
			this.year = matcher.group(1);
			this.month = matcher.group(2);
			this.day = matcher.group(3);
			this.dayOfWeek = matcher.group(4);
		}
		
		@Override
		public String toString() {
			return String.format("%s-%s-%s %s", year, month, day, dayOfWeek);
		}
	}
	
}
