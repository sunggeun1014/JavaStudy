package quiz;

import java.util.Scanner;

public class B07_GuessDigit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = Math.abs(scan.nextInt());
		
		System.out.println(Integer.toString(input).length());
		
	}
}
