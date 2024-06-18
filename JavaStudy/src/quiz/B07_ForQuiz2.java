package quiz;

public class B07_ForQuiz2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 99; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(i + "번째 \t");
			for (int j = 0; j <= 9; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for (int i = 1; i <= 30; i++) {
			System.out.print(i + "번째 \t");
			for (int j = 10; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");

		String answer = "";
		for (int i = 0; i < 10; i++) {
			answer += 7;
			System.out.print(answer + " ");
		}
		

	}
}
