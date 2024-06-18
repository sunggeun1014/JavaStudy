package quiz;

import java.util.Scanner;

public class B13_RandomScores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 101);
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] < 60) {
				System.out.print("X\t");
			}else {
				System.out.print(array[i] + "\t");
			}
			
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.printf("평균 : %.2f\n", sum / array.length);
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]);
			min = Math.min(min, array[i]);
		}
		
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
		
	}
}