import java.util.Scanner;

public class B11_While {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while(i < 10) {
			System.out.println("Hello!" + ++i);
		}
		
		i = 0;
		while(i++ < 10) {
			System.out.println("Hello!" + i);
		}
		
		i = 0;
		while(++i < 10) {
			System.out.println("Hello!" + i);
		}
		

	}

}
