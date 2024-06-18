package quiz;

import java.util.Scanner;

public class B11_Count369 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= input; i++) {
			int num = i;
			while(num != 0) {
				if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
					cnt++;
				}
				num /= 10;
			}
		}
		
		System.out.println(cnt);
	}
}
