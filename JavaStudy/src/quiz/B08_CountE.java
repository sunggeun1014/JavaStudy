package quiz;

import java.util.Scanner;

public class B08_CountE {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine().toLowerCase();
		int cnt = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'e') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
