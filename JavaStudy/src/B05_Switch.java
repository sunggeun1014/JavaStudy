
public class B05_Switch {

	public static void main(String[] args) {
		
		int a = 10;
		
		switch (a) {
			case 10:
				System.out.println("Hello~!");
				break;
			case 11:
				System.out.println("Good bye~~~");
				break;
			default:
				System.out.println("Command Not Found...");
				break;
		}
		
		int num = 13;
		
		switch (Math.abs(num % 2)) {
			case 1:
				System.out.println(num + "은 홀수입니다.");
				break;
			case 0:
				System.out.println(num + "은 짝수입니다.");
				break;
		}
		
		String cmd = "dir";
		
		switch(cmd) {
			case "cd":
				System.out.println("디렉토리 변경");
				break;
			case "dir":
				System.out.println("현재 디렉토리 정보");
				break;
			default:
				System.out.println("명령어를 찾지 못함");
				break;
		}
		
	}
}
