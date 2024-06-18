package quiz;

import java.util.Scanner;

public class B00_WonToDollar {

	/*
		한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
		(현재 환율은 검색, 달러는 소수점 둘째 자리까지 출력)
	*/
	public static void main(String[] args) {
		
		// Scanner, println(), printf()
		Scanner sc = new Scanner(System.in);

		System.out.print("KRW > ");
		int krw = sc.nextInt();
		
		// 1달러 당 1373.55원
		double exchangeRate = 1373.55;
		
		double usd = krw / exchangeRate;
		
		System.out.printf("%dKRW은 %.2fUSD입니다.\n", krw, usd);
	}
	
}



