package quiz;

import java.util.Scanner;

public class D10_CaesarCipher {
	
	static String codeTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("암호화할 문자열 입력 >> ");
		String input = scan.nextLine();
		
		System.out.print("key값 입력 >> ");
		int key = scan.nextInt();
		
		String encryption = encryption(input, key);
		System.out.println("암호화 : " + encryption);
		
		String decryption = decryption(encryption, key);
		System.out.println("복호화 : " + decryption);
	}
	
	public static String encryption(String str, int key) {
		StringBuilder sb = new StringBuilder(str);
		int len = codeTable.length();
		
		for (int i = 0; i < sb.length(); i++) {
			int index = codeTable.indexOf(sb.charAt(i)) + key;
			
			if(index >= len) {
				index %= len;
			}
			
			sb.setCharAt(i, codeTable.charAt(index));
		}
		
		return sb.toString();
	}
	
	public static String decryption(String str, int key) {
		StringBuilder sb = new StringBuilder(str);
		int len = codeTable.length();
		
		for (int i = 0; i < sb.length(); i++) {
			int index = codeTable.indexOf(sb.charAt(i)) - key;
			
			if(index < 0) {
				index = len + index % len;
			}
			
			sb.setCharAt(i, codeTable.charAt(index));
		}
		
		return sb.toString();
	}

}
