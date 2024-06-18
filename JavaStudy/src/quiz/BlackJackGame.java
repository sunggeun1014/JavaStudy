package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import myobj.blackjack.Card;
import myobj.blackjack.GameLogic;

public class BlackJackGame {
	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		Player player = new Player(0, 3000);
		Player dealer = new Player(1, 0);
		
		CardDeck deck = new CardDeckImpl();
		
		System.out.println("#### 블랙잭! ####");
		while (true) {
			System.out.print("배팅 금액 > ");
			int bet = scan.nextInt();
			
			if(player.getMoney() == 0) {
				System.out.println();
				break;
			}else if(bet > player.getMoney()) {
				System.out.println("배팅금액이 보유금액보다 많을 수 없습니다.");
				continue;
			}
			
			player.addCard(deck.draw());
			player.addCard(deck.draw());
			
			dealer.setPrintType(Player.DEALER_NOT_OPEN);
			dealer.addCard(deck.draw());
			dealer.addCard(deck.draw());
			
			player.printHand();
			dealer.printHand();
			
			while(true) {
				System.out.print("1.hit\t2.stand\n> ");
				int select = scan.nextInt();
				
				if(select == 1) {
					player.addCard(deck.draw());
					player.printHand();
					
					int value = GameLogic.getValue(player.getHand());
					
					if(value >= 21) {
						break;
					}
				}else if(select == 2) {
					break;
				}else {
					System.out.println("제대로 골라주세요...");
				}
			}

			System.out.println("-- 게임 결과 --");
			player.printHand();
			dealer.setPrintType(Player.DEALER_OPEN);
			dealer.printHand();
			
			if(GameLogic.getValue(player.hand) < 21) {
				// 딜러가 카드를 뽑는 곳 (16이하라면 계속 뽑는다. 플레이어가 버스트라면 뽑지 않아도 된다.)
				while(GameLogic.getValue(dealer.getHand()) <= 16) {
					dealer.addCard(deck.draw());
					dealer.printHand();
					Thread.sleep(1000);
				}
			}
			
			int result = GameLogic.check(player.getHand(), dealer.getHand());
			
			switch(result) {
				case GameLogic.PLAYER_WIN:
					player.earnMoney(bet);
					System.out.println("플레이어가 이겼습니다!");
					System.out.println("현재 플레이어의 소지금: " + player.getMoney());
					break;
				case GameLogic.DEALER_WIN:
					System.out.println("딜러가 이겼습니다!");
					System.out.println("현재 플레이어의 소지금: " + player.getMoney());
					player.lossMoney(bet);
					break;
				case GameLogic.PUSH:
					System.out.println("비겼습니다!");
					break;
			}
			
			player.resetHand();
			dealer.resetHand();
		}

	}
	
	public static class Player {
		final public static int USER_PLAYER = 0;
		final public static int DEALER_NOT_OPEN = 1;
		final public static int DEALER_OPEN = 2;
		
		int printType; // 0이면 일반 플레이어, 1이면 카드 가려놓는 딜러, 2면 카드 오픈하는 딜러
		int money;
		public List<Card> hand = new ArrayList<>();
		
		public Player(int printType, int money) {
			this.printType = printType;
			this.money = money;
		}
		
		public void addCard(Card card) {
			hand.add(card);
		}
		
		public List<Card> getHand() {
			return hand;
		}
		
		public void setPrintType(int printType) {
			this.printType = printType;
		}
		
		public void printHand() {
			if(printType == 0) {
				System.out.printf("플레이어: %s (%d)\n", hand, GameLogic.getValue(hand));
			}else if(printType == 1) {
				System.out.printf("딜러: X %s\n", hand.get(1));
			}else if(printType == 2) {
				System.out.printf("딜러: %s (%d)\n", hand, GameLogic.getValue(hand));
			}
		}
		
		public void resetHand() {
			while(hand.size() > 0) {
				hand.remove(0);
			}
		}
		
		public void printMoney() {
			System.out.println(money);
		}
		
		public void earnMoney(int money) {
			this.money += money;
		}
		
		public void lossMoney(int money) {
			this.money -= money;
		}
		
		public int getMoney() {
			return this.money;
		}
		
	}
	
	public interface CardDeck {
		
		void shuffle();
		Card draw();
	}
	
	public static class CardDeckImpl implements CardDeck {

		LinkedList<Card> cards = new LinkedList<>();
		
		public CardDeckImpl() {
			reset();
		}
		
		private void reset() {
			for (int i = 0; i < Card.NUM_OF_SUITS; i++) {
				for (int j = 0; j < Card.NUM_OF_RANKS; j++) {
					cards.add(new Card(i, j));
				}
			}
			shuffle();
		}
		
		@Override
		public void shuffle() {
			Collections.shuffle(cards);
		}

		@Override
		public Card draw() {
			// list.remove() : 비어있을때 에러 발생(예외처리 방식으로 해결 가능)
			// list.pollFirst() : 비어있으면 null을 리턴 (if문으로 해결 가능)
			// 외워서 해결하는 것이 아니라 메서드에 대한 주석을 읽어보고 알아야 한다.
			Card card = cards.pollFirst();
			
			if(card == null) {
				reset();
				shuffle();
				return draw(); // 재귀 호출
			}
			
			return card;
		}

	}
}
