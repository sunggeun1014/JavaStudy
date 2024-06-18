package quiz;

import java.util.Arrays;

public class B14_Array2Quiz {
	
	public static void main(String[] args) {
		
		int maxLen = 0;
		
		int[][] myArr = {
				new int[5],
				new int[7],
				new int[3],
				new int[10],
				{1, 1, 1, 1}
		};
		
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				myArr[i][j] = (int)(Math.random() * 101 + 100);
			}
		}
		
		int sum = 0;
		float cnt = 0;
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				sum += myArr[i][j];
				cnt++;
			}
			maxLen = Math.max(maxLen, myArr[i].length);
		}
		System.out.println("총 합 : " + sum);
		System.out.printf("평균 : %.2f\n", sum / cnt);
		
		int[] rowSumArray = new int[myArr.length];
		int[] colSumArray = new int[maxLen];
		
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				colSumArray[j] += myArr[i][j];
				rowSumArray[i] += myArr[i][j];
			}
		}
		
		System.out.println("원본");
		for(int[] i : myArr) {
			System.out.println(Arrays.toString(i));
		}
		System.out.print("행 합 : ");
		System.out.println(Arrays.toString(rowSumArray));
		System.out.print("열 합 : ");
		System.out.println(Arrays.toString(colSumArray));
		
		
	}

}
