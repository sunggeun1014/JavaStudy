package quiz;

import java.util.Scanner;

import javax.lang.model.SourceVersion;

public class D05_IsJavaVariable {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			System.out.println("자바의 변수로 사용할 수 있는가? " + isUseCheck(scan.nextLine()));
		}
	}
	
	public static boolean isUseCheck(String str) {
		boolean useCheck = !SourceVersion.isKeyword(str);
		
		useCheck &= Character.isJavaIdentifierStart(str.charAt(0)); 
		
		for (char c : str.toCharArray()) {
			useCheck &= Character.isJavaIdentifierPart(c);
		}
		
		return useCheck;
	}

}
