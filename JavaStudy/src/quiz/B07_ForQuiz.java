package quiz;

public class B07_ForQuiz {

	public static void main(String[] args) {

		for (int i = 1000; i <= 2000; i++) {
			if (i % 13 == 0) {
				System.out.println("13의 배수 : " + i);
			}
		}

		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50부터 100사이 합 : " + sum);

		int cnt = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 10 == 0) {
				if (cnt == 8) {
					cnt = 0;
					System.out.println();
				}

				cnt++;
				System.out.print(i + "\t");
			}
		}
		System.out.println();

		long answer = 1;
		for (int i = 1; i <= 19; i++) {
			answer *= i;
		}

		System.out.println("곱 : " + answer);

		for (int i = 8999, count = 0; i >= 4999; i--) {
			if (i % 287 == 0) {
				count++;
				if (count % 5 == 0) {
					System.out.println("287의 배수 : " + i);
				}
			}
		}
	}

}
