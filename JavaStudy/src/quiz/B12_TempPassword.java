package quiz;

import java.util.Scanner;

public class B12_TempPassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < 20; i++) {
			String password = "";
			for (int j = 0; j < 4; j++) {
				int num = (int)(Math.random() * 26) + 65;
				password += (char)num;
			}
			System.out.println(password);
		}		
	}
}
