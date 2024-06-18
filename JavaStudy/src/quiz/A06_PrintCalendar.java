package quiz;

public class A06_PrintCalendar {

	public static void main(String[] args) {
	
		System.out.printf(
				"%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n", 
				"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.printf(
				"%5c%02d   %02d   %02d   %02d   %02d   %02d\n", 
				' ', 1, 2, 3, 4, 5, 6);
		System.out.printf(
				"%02d   %02d   %02d   %02d   %02d   %02d   %02d\n", 
				7, 8, 9, 10, 11, 12, 13);
		System.out.printf(
				"%02d   %02d   %02d   %02d   %02d   %02d   %02d\n", 
				14, 15, 16, 17, 18, 19, 20);
		System.out.printf(
				"%02d   %02d   %02d   %02d   %02d   %02d   %02d\n", 
				21, 22, 23, 24, 25, 26, 27);
		System.out.printf(
				"%02d   %02d   %02d\n", 
				28, 29, 30);
	}
	
}
