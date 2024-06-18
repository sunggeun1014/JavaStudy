package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();

		if (input < 0) {
			System.out.println(0);
		} else if (input % 10 == 0) {
			System.out.println(input / 10);
		} else {
			System.out.println(input / 10 + 1);
		}

	}
}
