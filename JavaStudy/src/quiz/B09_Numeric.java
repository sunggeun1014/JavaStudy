package quiz;

import java.util.Scanner;

public class B09_Numeric {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input = scan.next();
		boolean check = true;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c > 57 || 48 > c) {
				check = false;
				break;
			}
		}

		if (check) {
			System.out.println("숫자로만 구성되어 있습니다.");
		} else {
			System.out.println("숫자외 문자가 들어가 있습니다.");
		}

	}
}
