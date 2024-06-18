package quiz;

import myobj.wheel.PrizeWheel;

public class C09_PrizeDraw {
	
	public static void main(String[] args) {
		
		PrizeWheel wheel = new PrizeWheel();
		
		wheel.addPrize("선풍기", 35000, 35, 20);
		wheel.addPrize("세탁기", 2000000, 10, 5);
		wheel.addPrize("츄파츕스", 100, 5000, 100);
		
		for (int i = 0; i < 100; i++) {
			int prizeNum;
			switch (prizeNum = wheel.draw()) {
			case -1:
				System.out.println("꽝입니다!");
				break;
			case -2:
				System.out.println("당첨되었지만 수량이 모두 소진되었습니다! 기회가 한번 더 주어집니다!");
				break;
			default:
				wheel.printPrizeInfo(prizeNum);
				break;
				
			
			}
		}
		
	}
}