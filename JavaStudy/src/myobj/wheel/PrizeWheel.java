package myobj.wheel;

import java.util.Arrays;

public class PrizeWheel {
	final private static boolean DEBUG_MODE = false;
	
	int[] win = new int[360];
	
	String[] prizeNames = new String[5];
	int[] prizeValues = new int[5];
	int[] prizeQty = new int[5];
	int[] prizeDegree = new int[5];

	int currPrizeIndex = 0;
	
	public void updateWheel() {
		for (int i = 0; i < win.length; i++) {
			win[i] = -1;
		}

		int winIndex = 0;
		for (int i = 0; i < currPrizeIndex; i++) {
			for (int j = 0; j < prizeDegree[i]; j++) {
				win[winIndex++] = i;
			}
		}
		
		if(DEBUG_MODE) {
			System.out.println("업데이트 된 확률배열의 정보");
			System.out.println(Arrays.toString(win));
		}
	}
	
	/**
	 * @return -1: 꽝, -2: 돌림판 당첨되었지만 수량소진, 그 외: 당첨된 상품번호
	 */
	public int draw() {
		int prizeNum = win[(int)(Math.random() * win.length)]; 
		if (prizeNum == -1) {
			return -1;
		}else if(prizeQty[prizeNum] == 0) {
			return -2;
		}
		
		--prizeQty[prizeNum];
		
		return prizeNum;
		
	}
	
	public void printPrizeInfo(int prizeNum) {
		System.out.printf("%d원 상당의 %s [남은수량: %d, 당첨확률:%.2f%%]\n", prizeValues[prizeNum], prizeNames[prizeNum], prizeQty[prizeNum], (float)prizeDegree[prizeNum] / win.length * 100);
	}
	
	public void addPrize(String name, int value, int qty, int degree) {
		prizeNames[currPrizeIndex] = name;
		prizeValues[currPrizeIndex] = value;
		prizeQty[currPrizeIndex] = qty;
		prizeDegree[currPrizeIndex] = degree;
		
		++currPrizeIndex;
		
		updateWheel();
	}
}
