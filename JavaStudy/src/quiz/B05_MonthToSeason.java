package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int input = scan.nextInt();
		
		switch (input) {
			case 12:
			case 1:
			case 2:
				System.out.println("겨울 입니다");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄 입니다");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름 입니다");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을 입니다");
				break;
			default:
				System.out.println("입력을 다시 확인해 주세요");
		}
		
		
		
		System.out.print("월 입력 : ");
		input = scan.nextInt();
		
		if(input == 12 || input == 1 || input == 2) {
			System.out.println("겨울 입니다.");
		}else if(input == 3 || input == 4 || input == 5) {
			System.out.println("봄 입니다.");
		}else if(input == 6 || input == 7 || input == 8) {
			System.out.println("여름 입니다.");
		}else if(input == 9 || input == 10 || input == 11) {
			System.out.println("가을 입니다.");
		}else {
			System.out.println("입력을 다시 확인해 주세요");
		}
		

		System.out.print("월 입력 : ");
		String inputStr = scan.next().toLowerCase();
		
		switch (inputStr) {
			case "december":
			case "january":
			case "february":
				System.out.println("겨울 입니다");
				break;
			case "march":
			case "april":
			case "may":
				System.out.println("봄 입니다");
				break;
			case "june":
			case "july":
			case "august":
				System.out.println("여름 입니다");
				break;
			case "september":
			case "october":
			case "november":
				System.out.println("가을 입니다");
				break;
			default:
				System.out.println("입력을 다시 확인해 주세요");
		}
		
	}

}
