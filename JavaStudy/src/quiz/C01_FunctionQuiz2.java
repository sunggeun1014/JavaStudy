package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	
	public static void main(String[] args) {

 		System.out.println(randomStr("Hello"));
		System.out.println(strReverse("Hello"));
		System.out.println(symmetry("HeeH"));
		System.out.println(Arrays.toString(getNums()));
	}
	
	public static String randomStr(String str) {
		char[] sArr = str.toCharArray();
		String output = "";
		
		while(str.length() != output.length()) {
			int index = (int) (Math.random() * str.length());
			
			if(sArr[index] != 0) {
				output += sArr[index];
				sArr[index] = 0;
			}
		}
		
		return output;
	}
	
	public static String strReverse(String str) {
		String output = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		
		return output;
	}
	
	public static boolean symmetry(String str) {
		int len = str.length();
		
		for (int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] getNums() {
		int[] nums = new int[7];
		int cnt = 0;
		
		while(cnt != 7) {
			boolean overlap = true;
			int num = (int) (Math.random() * 45 + 1);
			
			for(int n : nums) {
				if(num == n) {
					overlap = false;
				}
			}
			
			if(overlap) {
				nums[cnt] = num;
				cnt++;
			}
		}
		
		return nums;
	}
	
}
