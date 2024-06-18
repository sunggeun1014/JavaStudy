package quiz;

public class B11_WhileQuiz {

	public static void main(String[] args) {
		
		int num = 1000;
		while(num <= 2000) {
			if(num % 13 == 0) {
				System.out.print(num + ", ");
			}
			num++;
		}
		System.out.println();
		
		num = 50;
		long answer = 0;
		while(num <= 100) {
			answer += num;
			num++;
		}
		System.out.println("합 : " + answer);

		
		num = 1;
		int cnt = 0;
		while(num <= 1000) {
			if(num % 10 == 0) {
				System.out.print(num + " ");
				cnt++;
				if(cnt % 8 == 0) {
					System.out.println();
				}
			}
			num++;
		}
		System.out.println();
		
		num = 1;
		answer = 1;
		while(num <= 19) {
			answer *= num;
			num++;
		}
		System.out.println("곱 : " + answer);
		
		num = 8999;
		cnt = 0;
		while(num >= 4999) {
			if(num % 287 == 0) {
				cnt++;
				if(cnt % 5 == 0) {
					System.out.print(num + " ");
				}
			}
			num--;
		}
	}
}
