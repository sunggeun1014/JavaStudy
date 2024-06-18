package quiz;

import java.util.Scanner;

public class B12_TempPassword2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 20; i++) {
			String password = "";
			while(password.length() != 6) {
				int word = (int)(Math.random() * 90 + 33);
				
				if((word >= 58 && word <= 64) || (word >= 91 && word <= 96)) {
					continue;
				}else {
					password += (char)word;
				}
				
			}
			System.out.println(password);
		}
		
	}
}
