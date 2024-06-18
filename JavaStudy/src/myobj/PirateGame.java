package myobj;

import java.util.Arrays;

public class PirateGame {
	static final int[] MONEYS = { 1000, 500, -500, -1000 };
	PlayerInfo[] players = new PlayerInfo[4];
	int[] pirateGameArray = new int[20];
	int currentPlayer = 0;

	public void randomBoom() {
		Arrays.fill(pirateGameArray, 0);
		for (int i = 0; i < 4; i++) {
			int num = (int) (Math.random() * 20);

			if (pirateGameArray[num] == 1) {
				i--;
			} else {
				pirateGameArray[num] = 1;
			}
		}
	}

	public int[] getPirateGameArray() {
		return pirateGameArray;
	}

	public int pirateCheck(int num) {
		if (pirateGameArray[num] == 1) {
			return 1;
		} else if (pirateGameArray[num] == 2) {
			return 2;
		}
		return 0;
	}

	public void nextPlayer() {
		this.currentPlayer++;

		if (this.currentPlayer >= 4) {
			this.currentPlayer = 0;
		}

	}

	public void nextTurn(int num) {
		plusSuccessCnt();
		nextPlayer();
		pirateGameArrayCheck(num);
	}

	public int getPlayerCnt() {
		return players.length;
	}

	public void setPlayerInfo(String[] names, int money) {
		for (int i = 0; i < players.length; i++) {
			this.players[i] = new PlayerInfo(names[i], i, money, 0, 0);
		}
	}

	public void plusSuccessCnt() {
		this.players[this.currentPlayer].successCnt++;
	}

	public void setPlayerScore() {
		for (int i = 0; i < players.length; i++) {
			if (currentPlayer == i) {
				players[currentPlayer].score -= 100;
			} else {
				players[i].score += (players[i].successCnt * 100);
			}
		}
	}

	public void changeMoney() {
		PlayerInfo[] tempArr = Arrays.copyOf(players, players.length);
		Arrays.sort(tempArr, (o1, o2) -> o2.score - o1.score);

		for (int i = 0; i < tempArr.length; i++) {
			players[tempArr[i].player].money += MONEYS[i];
		}
	}

	public void pirateGameArrayCheck(int num) {
		pirateGameArray[num] = 2;
	}

	public boolean playerMinusCheck() {
		for (PlayerInfo info : players) {
			if (info.money < 0) {
				return false;
			}
		}
		return true;
	}

	public void printPlayerInfo() {
		Arrays.sort(players, (o1, o2) -> o2.score - o1.score);
		System.out.println("이름\t 점수\t 소지금");
		for (PlayerInfo info : players) {
			System.out.printf("%s\t %d\t %d\n", info.name, info.score, info.money);
		}
	}

	public void init() {
		randomBoom();
		this.currentPlayer = 0;
		for (PlayerInfo info : players) {
			info.successCnt = 0;
		}
	}

	public String getCurrentName() {
		return players[this.currentPlayer].name;
	}
}
