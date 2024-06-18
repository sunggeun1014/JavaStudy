package quiz;

import java.util.Random;

public class A02_SwapValue {

	public static void main(String[] args) {		
		// "랜덤 번호 생성 기계"를 하나 만든다
		Random ran = new Random();
		
		// "랜덤 번호 생성 기계"로부터 랜덤 번호를 하나씩 받아온다
		int a = ran.nextInt(30); 
		int b = ran.nextInt(30);
		
		System.out.println("a에 원래 보관된 값: " + a);
		System.out.println("b에 원래 보관된 값: " + b);
		// 코드를 추가해 두 변수의 값을 서로 교환하여 출력해보세요 (다른곳은 변경 불가능)
		
		// a = b를 실행하고 나면 a에 원래 보관되어 있던 값이 사라지고 b의 값이 a에 저장된다
		// a = b;
		// b = a를 실행하더라도 이미 a의 값은 b로 변해있기 때문에 두 값이 같아진다
		// b = a;
				
		// a의 값이 사라지는 것을 대비하여 따로 빼놓는다
		int backup = a;
		// a에는 b의 값을 대입한다
		a = b; 
		// b에는 아까 따로 빼놨던 a의 원래 값을 대입한다
		b = backup;
		
		////////////////////////////////////////////////////////////////		
		System.out.println("교환 후 a에 보관된 값: " + a);
		System.out.println("교환 후 b에 보관된 값: " + b);
	}
	
}




