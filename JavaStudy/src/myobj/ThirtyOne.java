package myobj;

public class ThirtyOne {
	// 현재 숫자
	int currentNum;
	// 인원
	int personnel;
	// 마지막 숫자
	int endNum;
	
	public ThirtyOne(int personnel, int endNum) {
		this.personnel = personnel;
		this.endNum = endNum;
	}
	
	public void currentNumAdd(int num) {
		currentNum += num;
	}
	
	public boolean currentNumCheck() {
		return currentNum >= endNum; 
	}
}
