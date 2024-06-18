package quiz;

import java.util.Scanner;

import myobj.BaskinGame;
import myobj.BaskinGame2;
import myobj.BaskinPlayer;

public class C05_31Game {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("참여하려는 인원은 몇명? ");
		int playerSize = scan.nextInt();
		System.out.print("이 게임의 마지막 숫자는? ");
		int lastNum = scan.nextInt();
		
		BaskinGame game = new BaskinGame2(lastNum);
		BaskinPlayer players = new BaskinPlayer(playerSize);
		
		int turn = 0;
		
		while(true) {
			int playerNum = players.getPlayerNum(turn);
			System.out.printf("플레이어%d의 차례 > ", playerNum);
			int result = game.next(scan.nextInt());
			
			if(result == -1) {
				System.out.println("[경고] 숫자를 1 ~ 3 사이의 숫자를 입력해주세요");
				continue;
			}else if(result == -2) {
				System.out.println("[경고] 그 숫자는 더할 수 없습니다.");
				continue;
			}
			
			System.out.printf("플레이어%d > %d!\n", playerNum, result);
			
			if(game.isEnd()) {
				System.out.printf("플레이어%d님의 패배입니다!\n", playerNum);
				break;
			}
			
			turn++;
		}
		
	}

}
