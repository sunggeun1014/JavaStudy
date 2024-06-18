import java.util.Random;

public class B11_Random {

	public static void main(String[] args) {
		
		Random ran1 = new Random();
		Random ran2 = new Random();
		Random ran3 = new Random();
		
		System.out.println("현재시간 : "+System.currentTimeMillis());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran1.nextInt());
			System.out.println(ran2.nextInt());
			System.out.println(ran3.nextBoolean());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran3.nextInt(100));
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran3.nextInt(10) - 5);
		}
		System.out.println("------------------");
		for (int i = 0; i < 30; i++) {
			System.out.println(ran3.nextInt(31) + 30);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 20) + 20);
		}		
			
		
		
		
	}
}
