package myobj;

public class BaskinGame2 extends BaskinGame {

	public BaskinGame2() {
		super(31);
	}
	
	public BaskinGame2(int num) {
		super(num);
	}
	
	@Override
	public int next(int num) {
		int diff = num - currentNum;
		
		if(diff < 1 && diff > 3) {
			return -1;
		} else if(num > lastNum) {
			return -2;
		}
		
		return currentNum = num;
	}
}
