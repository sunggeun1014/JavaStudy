package quiz;

import java.util.Scanner;

public class B08_ChangeCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				c += 32;
			}else if(c >= 'a' && c <= 'z') {
				c -= 32;
			}
			System.out.print(c);
		}
		
	}

}
