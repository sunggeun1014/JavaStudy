
public class C04_Static {

	public static void main(String[] args) {

		TrumphCard spade_a = new TrumphCard(0, 0);
		TrumphCard spade_2 = new TrumphCard(1, 0);
		TrumphCard heart_10 = new TrumphCard(9, 1);
		
		System.out.println("스페이드A의 너비 : " + spade_a.card_width);
		System.out.println("스페이드2의 너비 : " + spade_2.card_width);
		System.out.println("하트10의 너비 : " + heart_10.card_width);
		
		spade_a.card_height = 111;
		
		System.out.println(spade_a.card_height);
		System.out.println(spade_2.card_height);
		System.out.println(heart_10.card_height);

	}
}
class TrumphCard {
	int rank;
	int suit;
	
	static int card_width = 80;
	static int card_height;
	
	public TrumphCard(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	static void setCardWidth(int card_width) {
		TrumphCard.card_width = card_width;
	}
	
	static void printCardInfo() {
		System.out.println("이 카드의 너비 : " + card_width);
		System.out.println("이 카드의 높이 : " + card_height);
	}
}