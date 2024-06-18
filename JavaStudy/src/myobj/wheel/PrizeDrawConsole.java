package myobj.wheel;

public class PrizeDrawConsole {

	public static void main(String[] args) {
		
		PrizeWheel2 wheel = new PrizeWheel2();
		
		// 이름, 가치, 수량, 각도
		wheel.add(new Prize("에어컨", 3000000, 5, 3));
		wheel.add(new Prize("냉장고", 4000000, 3, 2));
		wheel.add(new Prize("츄파츕스", 100, 500, 100));
		
		wheel.modifyDegree(0, 100);
		
		for (int i = 0; i < 10; i++) {
			Prize prize = wheel.draw();
			
			if(prize == null) {
				continue;
			}
			
			if(prize.getQty() != 0) {
				prize.minusQty();
				System.out.printf("[%s]를 뽑았습니다! (남은수량: %d. 당첨확률: %.2f%%\n", prize, prize.getQty(), prize.getDegree() / 360.0 * 100);
			}else {
				System.out.println("[" + prize + "]" + "를 뽑았지만 수량이 모두 소진되어 다시 뽑아야 합니다!");
				--i;
			}
		}
		
	}
}
