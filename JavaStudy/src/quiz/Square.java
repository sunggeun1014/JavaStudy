package quiz;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		System.out.print("가로 입력 : ");
		float a = scan.nextFloat();
		System.out.print("세로 입력 : ");
		float b = scan.nextFloat();
		
		System.out.printf("\"%s\" 직사각형의 넓이는 %.2f\n", name, a * b);		
		System.out.println(a * b > 100 && a * b < 500);
		scan.close();
	}
}
