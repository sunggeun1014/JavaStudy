package quiz;

import myobj.Carp;

public class C04_CountFishBread {
	
	public static void main(String[] args) {
		
		Carp[] carp = new Carp[100];
		int[] tasteCnt = new int[3];
		
		for (int i = 0; i < carp.length; i++) {
			carp[i] = new Carp(3);
		}
		
		for (Carp info : carp) {
			if(info.taste.equals("팥")) {
				tasteCnt[0]++;
			}else if(info.taste.equals("슈크림")) {
				tasteCnt[1]++;
			}else if(info.taste.equals("민트초코")) {
				tasteCnt[2]++;
			}
		}
		
		System.out.println("팥 개수 : " + tasteCnt[0]);
		System.out.println("슈크림 개수 : " + tasteCnt[1]);
		System.out.println("민트초코 개수 : " + tasteCnt[2]);
		
		carpTotalPrice(carp);
	}
	
	public static void carpTotalPrice(Carp[] carp) {
		int result = 0;
		
		for (Carp info : carp) {
			result += info.price;
		}
		
		System.out.println("총 가격 : " + result);
	}
	
}
