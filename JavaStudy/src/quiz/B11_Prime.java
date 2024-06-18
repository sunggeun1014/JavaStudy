package quiz;

import java.util.Scanner;

public class B11_Prime {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		for(int i = 2; i <= input; i++) {
			boolean check = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					check = false;
					break;
				}
			}
			
			if(check) {
				System.out.print(i + " ");
			}
			
		}
	}

}
