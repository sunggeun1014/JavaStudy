package quiz;

public class B10_Gugudan {

	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d단: ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t\t", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단\t\t", i);
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, i * j);
			}
		}		
		
	}
}
