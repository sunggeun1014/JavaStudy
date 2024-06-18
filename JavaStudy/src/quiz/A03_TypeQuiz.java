package quiz;

public class A03_TypeQuiz {

	public static void main(String[] args) {	
		String name = "홍길동";
		// 자원을 아주 절약해야하는 상황이 아니라면 그냥 int쓰는 편
		int age = 20; 
		String tel = "010-1234-1234";
		// 자원을 아주 절약해야하는 상황이 아니라면 그냥 double쓰는 편
		double height = 178.5;		
		double weight = 75;		
		// AB형은 char타입에 저장할 수 없으므로 String을 써야 한다
		String blood = "O";
		
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tel);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + blood);
	}
	
}
