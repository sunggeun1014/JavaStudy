package myobj;

public class BaskinGame {
	
	int lastNum;
	
	int currentNum;
	
	public BaskinGame(int lastNum) {
		this.lastNum = lastNum;
	}
	
	public int next(int num) {
		if(num < 1 || num > 3) {
			return -1;
		} else if(currentNum + num > lastNum) {
			return -2;
		}
		return currentNum += num;
	}
	
	public boolean isEnd() {
		return currentNum == lastNum;
	}
}
