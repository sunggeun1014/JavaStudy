package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class E09_SaveGame2 {
	
	public static void main2(String[] args) {
		
		//전적 불러오기
		File saveFile = new File("myfiles/rspgame.sav");
		
		int win, draw, lose;
		
		if(!saveFile.exists()) {
			win = 0;
			draw = 0;
			lose = 0;
		} else {
			// 파일에 있는 전적을 읽어서 저장한다.
			try (
				FileInputStream fin = new FileInputStream(saveFile);
				DataInputStream din = new DataInputStream(fin);
			) {
				win = din.readInt();
				draw = din.readInt();
				lose = din.readInt();
			} catch (Exception e) {
				e.printStackTrace();
				win = 0;
				draw = 0;
				lose = 0;
			}
		}
		System.out.printf("게임 시작전 불러들인 전적: %d승 %d무 %d패\n", win, draw, lose);
		
		char[] shapes = {0x270C, 0x270A, 0x270B};
		Scanner sc = new Scanner(System.in);
		// 게임 진행하기
		for (int i = 0; i < 10; i++) {
			System.out.println("가위(0), 바위(1), 보(2) > ");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3);
			
			if(user == com) {
				System.out.printf("무승부입니다! (user:%c vs com:%c)\n", shapes[user], shapes[com]);
				++draw;
			} else if((user + 1) % 3 == com) {
				System.out.printf("당신의 패배입니다! (user:%c vs com:%c)\n", shapes[user], shapes[com]);
				++lose;
			} else {
				System.out.printf("당신의 승리입니다! (user:%c vs com:%c)\n", shapes[user], shapes[com]);
				++win;
			}
		}
		
		
		System.out.printf("게임이 10번 진행되고 난 후의 전적: %d승 %d무 %d패\n", win, draw, lose);
		// 전적 저장하기
		
		try (
			FileOutputStream fout = new FileOutputStream(saveFile);
			DataOutputStream dout = new DataOutputStream(fout);	
		) {
			dout.writeInt(win);
			dout.writeInt(draw);
			dout.writeInt(lose);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}







public class E09_SaveGame {

	/*
		컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
		프로그램 종료시 여태까지의 게임 전적을 파일에 저장해주세요
		
		프로그램 실행시에는 파일에 저장되어있는 전적 데이터를 읽어 예전 기록이 계속해서 이어지도록 만들어보세요.
	 */
	static String[] kind = {"가위", "바위", "보"}; 
	static final int GAME_WIN = 1;
	static final int GAME_LOSE = 2;
	static final int GAME_DRAW = 3;
	static int total = 0;
	static int win = 0;
	static int lose = 0;
	static int draw = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		getScore();
		while(true) {
			System.out.print("가위바위보 입력(가위(1), 바위(2), 보(3), 종료(0)) >> ");
			int choice = scan.nextInt() - 1;
			
			if(choice == -1) {
				System.out.println("게임 종료");
				scoreSave();
				return;
			}
			
			int result = gameCheck(choice, getRandom());
			
			if(result == GAME_WIN) {
				System.out.println("게임에서 승리하였습니다.");
				win++;
			} else if(result == GAME_LOSE) {
				System.out.println("게임에서 패배하였습니다.");
				lose++;
			} else if(result == GAME_DRAW) {
				System.out.println("게임에서 비겼습니다.");
				draw++;
			}
			total++;
			
			
		}
		
		
	}
	
	public static int getRandom() {
		return (int)(Math.random() * 3);
	}
	
	public static int gameCheck(int user, int computer) {
		System.out.printf("user: %s vs computer: %s\n", kind[user], kind[computer]);
		if(user == computer) {
			return GAME_DRAW;
		} else if((user + 1) % 3 == computer) {
			return GAME_LOSE;
		} else {
			return GAME_WIN;
		}
			
	}
	
	public static void getScore() {
		File file = new File("myfiles/scoreManagement.txt");
		
		if(file.exists()) {
			try (
				FileInputStream fin = new FileInputStream("myfiles/scoreManagement.txt");
				DataInputStream din = new DataInputStream(fin);	
			) {
				total = din.readInt();
				win = din.readInt();
				lose = din.readInt();
				draw = din.readInt();
				
				System.out.printf("[전적] %d전 %d승 %d패 %d무\n", total, win, lose, draw);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("현재 전적이 없습니다.");
		}
	}
	
	public static void scoreSave() {
		try (
			FileOutputStream fout = new FileOutputStream("myfiles/scoreManagement.txt");
			DataOutputStream dout = new DataOutputStream(fout);	
		) {
			dout.writeInt(total);
			dout.writeInt(win);
			dout.writeInt(lose);
			dout.writeInt(draw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
