package myobj;

public class Carp {
	public String taste;
	public int price;
	public String rank;
	
	public Carp(int n) {
		setRanTaste(getRanNum(n));
		setRanRank(getRanNum(n));
	}
	
	int getRanNum(int n) {
		return (int)(Math.random() * n);
	}
	
	void setRanTaste(int n) {
		if(n == 0) {
			this.taste = "팥";
			this.price = 800;
		}else if(n == 1) {
			this.taste = "슈크림";
			this.price = 1000;
		}else if(n == 2) {
			this.taste = "민트초코";
			this.price = 1200;
		}
	}
	
	void setRanRank(int n) {
		if(n == 0) {
			this.rank = "상";
			this.price += 100;
		}else if(n == 1) {
			this.rank = "중";
		}else if(n == 2) {
			this.rank = "하";
			this.price -= 100;
		}
	}
	
}

