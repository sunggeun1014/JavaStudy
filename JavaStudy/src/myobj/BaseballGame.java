package myobj;

import java.util.Arrays;

public class BaseballGame {

	int[] answer = new int[4];
	int chance = 9;

	public BaseballGame() {
		genAnswer();
	}

	void genAnswer() {
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)(Math.random() * 10);
			
			for (int j = 0; j < i; j++) {
				if(answer[i] == answer[j]) {
					--i;
					break;
				}
			}
		}
	}
	
	public void printAnswer() {
		System.out.println("정답은 " + Arrays.toString(answer) + " 입니다.");
	}
	
	public BaseballGameResult guessNumber(int[] guessNum) {
		int[] result = guessNumber(guessNum[0], guessNum[1], guessNum[2], guessNum[3]);
		return new BaseballGameResult(result[0], result[1]);
	}
	
	public int[] guessNumber(int a, int b, int c, int d) {
		int[] result = {0, 0};
		
		for (int i = 0; i < answer.length; i++) {
			if(answer[i] == a) {
				if(i == 0) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if(answer[i] == b) {
				if(i == 1) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if(answer[i] == c) {
				if(i == 2) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if(answer[i] == d) {
				if(i == 3) {
					++result[0];
				} else {
					++result[1];
				}
				
			}
		}
		
		return result;
	}
	
	public void minusChance() {
		--this.chance;
	}
	
	public int getChance() {
		return this.chance;
	}
	
}
