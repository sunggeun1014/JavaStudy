import java.util.Scanner;

public class B00_Scanner {

	/*
		# java.util.Scanner 클래스
		
		- 사용자로부터 입력을 받을 수 있는 여러 기능들이 모여있는 클래스
		- 새 스캐너를 생성할 때 어느곳으로부터 입력을 받을지 설정할 수 있다 
		
		  System : 현재 운영체제의 콘솔
		  System.out : 프로그램에서 콘솔로 데이터를 내보낼 수 있는 통로
		  System.in : 콘솔에서 프로그램으로 데이터가 들어오는 통로 
		  
		# 스캐너 클래스의 대표적인 기능들
		
		  (1) next타입() 메서드 - nextInt(), nextDouble(), nextFloat() ...
		  
		    - 입력 통로로부터 다음 값 하나를 꺼내오는 기능
		    - 문자열 형태로 값을 꺼낸 후 원하는 타입으로 변환해준다
		    - 입력 통로의 값들은 공백, \t, \n을 기준으로 구분할 수 있다
		    - 입력 통로에 꺼낼 값이 없는 경우 프로그램을 멈추고 새로운 값을 기다린다
		    - nextString()은 없다
		    
		  (2) next() 메서드
		  
		    - 입력 통로로부터 다음 값 하나를 문자열로 꺼내는 기능
		    - 입력 통로의 값들은 공백, \t, \n을 기준으로 구분하기 때문에 
		      문장은 입력받을 수 없다 
		      
		  (3) nextLine() 메서드
		  
		    - 입력 통로로부터 다음 값 하나를 문자열로 꺼내는 기능
		    - \n만을 기준으로 구분하기 때문에 한 줄 전체를 입력받을 수 있다
	*/
	public static void main(String[] args) {	
		
		// 새 스캐너 생성과 동시에 어디에서 입력받을지 설정
		Scanner sc = new Scanner(System.in);
			
		System.out.print("숫자를 딱 하나만 입력해주세요 > ");		
		// sc.nextInt() : 위에서 만든 스캐너의 nextInt() 기능을 사용한다
		//				  (다음 정수 입력을 기다리는 기능)
		int num1 = sc.nextInt();		
		System.out.println("입력하신 숫자는 " + num1 + "입니다.");
		
		// next타입()를 쓰고 난 후 남아있는 \n이 문제가 된다면
		// nextLine()을 사용해 \n을 비워버릴 수 있다
		String trash = sc.nextLine();
		System.out.println("nextInt() 쓰고난 후 남은 찌꺼기: " + trash);
		
		System.out.print("텍스트를 입력 > ");
		String text = sc.nextLine();		
		System.out.printf("입력하신 텍스트는 \"%s\"입니다.\n", text);
	}
	
}







