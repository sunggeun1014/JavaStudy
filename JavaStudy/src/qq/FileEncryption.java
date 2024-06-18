package qq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEncryption {

	static String codeTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	static String filePath = "myfiles/";
	static String fileName = "frankenstein_encrypted.enc";
	static long start, end;
	static int key = 180;
	
	public static void main(String[] args) {
		encryption1();
		encryption2();
		encryption3();
	}
	
	public static void encryption1() {
		start = System.currentTimeMillis();
		
		try (
			FileReader reader = new FileReader("myfiles/frankenstein.txt");
			FileWriter writer = new FileWriter(filePath + getFileName());
		) {
			int ch;
			while((ch = reader.read()) != -1) {
				int index = codeTable.indexOf((char)ch);
				
				if(index == -1) {
					writer.write((char)ch);
				} else {
					int result = (index + key) % codeTable.length();
					writer.write(codeTable.charAt(result));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		end = System.currentTimeMillis();
		System.out.println("encryption1 걸린시간 : " + (end - start) + "ms");
	}
	
	public static void encryption2() {
		start = System.currentTimeMillis();
		
		try (
			FileReader reader = new FileReader("myfiles/frankenstein.txt");
			FileWriter writer = new FileWriter(filePath + getFileName());
		) {
			char[] buff = new char[1024];
			int len;
			while((len = reader.read(buff)) != -1) {
				String str = new String(buff, 0, len);
				for(char c : str.toCharArray()) {
					int index = codeTable.indexOf(c);
					
					if(index == -1) {
						writer.write(c);
					} else {
						int result = (index + key) % codeTable.length();
						writer.write(codeTable.charAt(result));
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		end = System.currentTimeMillis();
		System.out.println("encryption2 걸린시간 : " + (end - start) + "ms");
	}
	
	public static void encryption3() {
		start = System.currentTimeMillis();
		
		try (
			FileReader reader = new FileReader("myfiles/frankenstein.txt");
			BufferedReader br = new BufferedReader(reader);
				
			FileWriter writer = new FileWriter(filePath + getFileName());
		) {
			String str;
			while((str = br.readLine()) != null) {
				for(char c : str.toCharArray()) {
					int index = codeTable.indexOf(c);
					
					if(index == -1) {
						writer.write(c);
					} else {
						int result = (index + key) % codeTable.length();
						writer.write(codeTable.charAt(result));
					}
				}
				writer.write('\n');
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		end = System.currentTimeMillis();
		System.out.println("encryption3 걸린시간 : " + (end - start) + "ms");
	}
	
	public static String getFileName() {
		File file = new File(filePath + fileName);
		
		int count = 1;
		while(file.exists()) {
			file = new File(filePath + fileName.replace(".", "(" + count + ")."));
			count++;
		}
		
		return file.getName();
	}
	
}
