package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.PirateGame;

public class C05_PirateGame {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PirateGame game = new PirateGame();
		
		String[] names = new String[] {"1P", "2P", "3P", "4P"}; 
		game.setPlayerInfo(names, 5000);

		while(true) {
			game.init();
			System.out.println("정답 => " + Arrays.toString(game.getPirateGameArray()));
			
			while(true) {
				System.out.printf("[%s] 숫자 입력 (1 ~ 20) : ", game.getCurrentName());
				int choice = scan.nextInt() - 1;
				int check = game.pirateCheck(choice); 
				if(check == 1) {
					System.out.println("꽝!");
					game.setPlayerScore();
					game.changeMoney();
					
					if(!game.playerMinusCheck()) {
						game.printPlayerInfo();
						return;
					}
					
					System.out.print("게임 진행 여부(Y/N) : ");
					String yn = scan.next();
					if(yn.equals("Y") || yn.equals("y")) {
						break;
					}else if(yn.equals("N") || yn.equals("n")) {
						game.printPlayerInfo();
						return;
					}
				}else if(check == 2){
					System.out.println("이미 선택했던 홈 입니다.");
				}else {
					game.nextTurn(choice);
				}
				
			}
			
			
		}
			
			
			
	}
}