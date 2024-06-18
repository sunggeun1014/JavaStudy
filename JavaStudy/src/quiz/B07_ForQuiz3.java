package quiz;

import java.util.Scanner;

public class B07_ForQuiz3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		if(input > 0) {
			for (int i = 1, cnt = 0; i <= input; i++) {
				if(i % 3 == 0) {
					System.out.print(i + " ");
					cnt++;
					if(cnt % 6 == 0) {
						System.out.println();
					}
				}
			}
		}else {
			for (int i = -1, cnt = 0; i >= input; i--) {
				if(i % 3 == 0) {
					System.out.print(i + " ");
					cnt++;
					if(cnt % 6 == 0) {
						System.out.println();
					}
				}
			}
		}
		
		
	}
}
