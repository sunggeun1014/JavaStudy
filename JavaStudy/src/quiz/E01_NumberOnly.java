package quiz;

import java.util.Scanner;

public class E01_NumberOnly {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		userInput();
	}
	
	public static void userInput() {
		try {
			System.out.print("숫자를 입력해주세요 >> ");
			int input = scan.nextInt();
			
			System.out.print("입력한 숫자 : " + input);
		} catch (Exception e) {
			System.out.println("숫자만 입력이 가능합니다.");
			scan.nextLine();
			userInput();
		}
	}

}
