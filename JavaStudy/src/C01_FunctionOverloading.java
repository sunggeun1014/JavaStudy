
public class C01_FunctionOverloading {

	public static void main(String[] args) {
		
		C00_Function.rabbit();
		
		System.out.println(add(5));
		System.out.println(add(12));
		
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a) {
		return a + 10;
	}
	
	public static double add(double a) {
		return a + 10;
	}
}
