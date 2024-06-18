package quiz;

import java.util.Arrays;

public class B13_Lotto {

	public static void main(String[] args) {

		int[] lotto = new int[7];
		int index = 0;
		int answer = 0;
		int bonus_index = lotto.length - 1;

		while(index != lotto.length) {
			boolean check = true;
			int num = (int) (Math.random() * 45 + 1);
				
			for (int i = 0; i < index; i++) {
				if(lotto[i] == num) {
					check = false;
					break;
				}
			}
			
			if(check) {
				lotto[index] = num;
				index++;
			}
		}
		
		while(true) {
			int[] nums = new int[6];
			index = 0;
			int cnt = 0;
			boolean bonus = false;
			
			while(index != nums.length) {
				boolean check = true;
				int num = (int) (Math.random() * 45 + 1);
					
				for (int i = 0; i < index; i++) {
					if(nums[i] == num) {
						check = false;
						break;
					}
				}
				
				if(check) {
					nums[index] = num;
					index++;
				}
			}
			
			for (int i = 0; i < lotto.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if(lotto[i] == nums[j]) {
						if(i == bonus_index) {
							bonus = true;
						}
						cnt++;
						break;
					}
					
				}
			}
			answer++;
			
			if(cnt == 6 && bonus) {
				System.out.println(Arrays.toString(lotto));
				System.out.println(Arrays.toString(nums));
				System.out.printf("%d 번째 도전하여 2등 당첨", answer);
				break;
			}else if (cnt == 6) {
				System.out.println(Arrays.toString(lotto));
				System.out.println(Arrays.toString(nums));
				System.out.printf("%d 번째 도전하여 1등 당첨", answer);
				break;
			}
			
		}

	}
}
