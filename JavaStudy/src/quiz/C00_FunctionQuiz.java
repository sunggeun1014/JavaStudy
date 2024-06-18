package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz {
	
	public static void main(String[] args) {
		System.out.println(isAlphabet('A'));
		System.out.println(isMulti(3));
		System.out.println(evenOrOdd(2));
		System.out.println(Arrays.toString(getNums(12)));
		System.out.println(isNum(7));
		stringRepeat("Hello", 3);
	}
	
	public static boolean isAlphabet(char c) {
		if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
			return true;
		}
		return false;
	}
	
	public static boolean isMulti(int num) {
		if(num % 3 == 0) {
			return true;
		}
		return false;
	}
	
	public static String evenOrOdd(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	public static int[] getNums(int num) {
		int[] array = new int[num];
		int index = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				array[index] = i;
				index++;
			}
		}
		
		return Arrays.copyOf(array, index);
	}
	
	public static boolean isNum(int num) {
		for (int i = 2; i <= Math.sqrt(num) ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void stringRepeat(String s, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
	
}
