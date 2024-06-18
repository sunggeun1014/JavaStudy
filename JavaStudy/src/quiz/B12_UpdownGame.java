package quiz;

import java.util.Scanner;

public class B12_UpdownGame {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = (int)(Math.random() * 100 + 1);
		int cnt = 6;
		int upPreNum = Integer.MAX_VALUE;
		int downPreNum = Integer.MAX_VALUE;
		
		while(cnt != 0) {
			
			int input = scan.nextInt();
			
			if(input == num) {
				System.out.println(input + " 정답입니다.");
				break;
			}else if(num > input){
				if(upPreNum != Integer.MAX_VALUE && Math.abs(num - input) >= Math.abs(num - upPreNum)) {
					System.out.printf("추측 범위를 벗어난 숫자입니다... (남은기회 %d회)\n", cnt);
					continue;
				}else {
					upPreNum = input;
					cnt--;
					System.out.printf("Up! (남은기회 %d회)\n", cnt);
				}
			}else if(num < input) {
				if(downPreNum != Integer.MAX_VALUE && Math.abs(num - input) >= Math.abs(num - downPreNum)) {
					System.out.printf("추측 범위를 벗어난 숫자입니다... (남은기회 %d회)\n", cnt);
					continue;
				}else {
					downPreNum = input;
					cnt--;
					System.out.printf("Down! (남은기회 %d회)\n", cnt);
				}
			}
			
			
		}
		
		if(cnt == 0) {
			System.out.printf("정답은 %d 입니다", num);
		}
		
	}
}
