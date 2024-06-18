package quiz;

import java.util.Scanner;

public class B08_palindrome {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next().toLowerCase();
		
		int len = input.length();
		for (int i = 0; i < len / 2; i++) {
			if(input.charAt(i) != input.charAt(len - 1 - i)) {
				System.out.println("좌우대칭이 아닙니다.");
				return;
			}
		}
		System.out.println("좌우대칭입니다.");
		
	}

}
