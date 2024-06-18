package quiz;

import java.util.Scanner;

public class D09_isPhoneNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String ph = " 010-1234-1231";
		
		System.out.println(isValidPhoneNumber(ph));
	}
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		phoneNumber = phoneNumber.trim();
		
		int len = phoneNumber.length();
		for (int i = 0; i < len; i++) {
			char ch = phoneNumber.charAt(i);
			
			if(!Character.isDigit(ch) && ch != '-') {
				System.out.println("[System] - 또는 숫자가 아닌 문자가 포함되어 있습니다.");
				return false;
			}
		}
		
		if(phoneNumber.contains("-")) {
			if (phoneNumber.length() != 13) {
				System.out.println("[System] 번호의 길이가 잘못되었습니다.");
				return false;
			} else if (phoneNumber.indexOf('-') != 3 || phoneNumber.lastIndexOf('-') != 8) {
				System.out.println("[System] -의 위치가 잘못되었습니다.");
				return false;
			}
		}
		
		phoneNumber = phoneNumber.replace("-", "");
		
		if(phoneNumber.length() != 11) {
			System.out.println("[System] 번호의 길이가 잘못되었습니다.");
			return false;
		}
		
		if(!phoneNumber.startsWith("010")) {
			System.out.println("[System] 번호가 010으로 시작하지 않습니다.");
			return false;
		}
				
		return true;
	}
}