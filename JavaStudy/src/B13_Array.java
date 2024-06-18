import java.util.Arrays;

public class B13_Array {

	public static void main(String[] args) {
		int[] number = new int[100];
		
		number[0] = 10;
		number[1] = 13;
		number[2] = 99;
		number[3] = (int)(Math.random() * 100 + 1);
		
		System.out.println(number[0]);
		System.out.println(number[1] + number[2]);
		System.out.println(number[3]);
		
		for (int i = 0; i < number.length; i++) {
			System.out.printf("number[%d]=%d\n", i, number[i]);
		}
		
		boolean[] passTest = new boolean[30];
		
		passTest[3] = true;
		passTest[15] = true;
		
		for (int i = 0; i < passTest.length; i++) {
			System.out.printf("passTest[%d]=%s\n", i, passTest[i]);
		}
		
		
		String[] strArr = new String[5];
		
		strArr[3] = "Good Job!!";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.printf("strArr[%d]=%s\n", i, strArr[i]);
		}
		
		int[] nums = {1, 3, 5, 7, 9, 11};
		char[] message = {'H', 'e', 'l', 'l', 'o', '!', '~'};
		String[] cmds = {"ls", "ipconfig", "chmod", "netstat"};
		
		String[] urls = new String[] {"naver.com", "google.com"};
		
		double[] avgs = new double[] {99.8, 75.5, 70.0, 60.8, 0.0, 2.3, 3.3, 4.4, '김', 4231423432141L, 123456, 3.1234F};
		
		System.out.println(nums);
		System.out.println(message);
		System.out.println(cmds);
		
		
		
	}
}