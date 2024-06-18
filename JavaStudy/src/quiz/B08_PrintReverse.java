package quiz;

import java.util.Scanner;

public class B08_PrintReverse {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}
		
	}

}
