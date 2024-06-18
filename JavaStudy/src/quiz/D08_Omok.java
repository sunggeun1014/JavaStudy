package quiz;

import myobj.omok.Omok;

public class D08_Omok {
	
	public static void main(String[] args) {
		
		Omok omok = new Omok();
		
		omok.putBlack(3, 3);
		omok.putBlack(4, 4);
		omok.putBlack(5, 5);
		omok.putBlack(6, 6);
		omok.putBlack(7, 7);
		
		System.out.println(omok.postCheck(7, 7, omok.BLACK_STONE));
		omok.printBoard();
		
	}
	
}
