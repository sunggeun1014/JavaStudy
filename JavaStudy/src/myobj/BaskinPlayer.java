package myobj;

public class BaskinPlayer {
	int playerSize;

	public BaskinPlayer(int playerSize) {
		this.playerSize = playerSize;
	}
	
	public int getPlayerNum(int turn) {
		return turn % playerSize + 1; 
	}
}
