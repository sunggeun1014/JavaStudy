package quiz;

import java.util.Scanner;

public class B13_ShuffleText {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[] input = scan.nextLine().replace(" ", "").toCharArray(); 
		String answer = "";
		
		while(input.length != answer.length()) {
			int index = (int)(Math.random() * input.length);
			
			if(input[index] != ' ') {
				answer += input[index];
				input[index] = ' ';
			}
		}
		
		System.out.println(answer);
		
	}
}
