
public class C00_Function {

	public static void main(String[] args) {
		System.out.println(basket(20, 6));
		
		System.out.println("프로그램이 끝났습니다.");
	}

	public static void rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >$");
	}

	public static void printNumbers() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

	public static void plusNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void repeatNumbers(int num, int times) {
		for (int i = 0; i < times; i++) {
			System.out.printf("%d가 %d번 반복되는 함수입니다.\n", num, times);
		}
	}

	public static void func(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}

	public static void plusAll(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("전달한 모든 숫자의 합은 " + sum + "입니다.");
	}
	
	public static void minusAll(int num) {
		
	}
	
	public static boolean allEven(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				return false;
			}
		}
		return true;
	}
	
	public static int basket(int apple, int size) {
		if(apple % size == 0) {
			return apple / size;
		}else {
			return apple / size + 1;
		}
	}

}
