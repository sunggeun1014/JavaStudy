package myobj;

public class PlayerInfo {
	String name;
	int player, money, score, successCnt;
	
	public PlayerInfo(String name, int player, int money, int score, int successCnt) {
		this.name = name;
		this.player = player;
		this.money = money;
		this.score = score;
		this.successCnt = successCnt;
	}
	
	public int getPlayer() {
		return this.player;
	}
	
}
