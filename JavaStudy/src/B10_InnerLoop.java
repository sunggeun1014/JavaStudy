
public class B10_InnerLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("===================바깥쪽 반복문" + i);
			
			for(int j = 0; j < 5; ++j) {
				System.out.printf("-----------안쪽 반복문 %d-%d\n", i, j);
				
				for (int k = 0; k < 3; k++) {
					System.out.printf("+++제일 안쪽 %d-%d-%d\n", i, j, k);
				}
			}
		}
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("#### %d단 ####\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
		
	}
}
