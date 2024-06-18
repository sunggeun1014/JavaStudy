package quiz;

import java.util.Arrays;

public class B13_Sort {
	
	public static void main(String[] args) {
		
		int[] array = new int[30];
		int[] tempArray = new int[30];
		
		for (int i = 0; i < 30; i++) {
			array[i] = (int) (Math.random() * 1000 + 1);
		}
		
		tempArray = Arrays.copyOf(array, 30);
		for (int i = 0; i < 30; i++) {
			for (int j = i + 1; j < 30; j++) {
				if(tempArray[j] < tempArray[i]) {
					int temp = tempArray[i];
					tempArray[i] = tempArray[j];
					tempArray[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(tempArray));
		
	}
}
