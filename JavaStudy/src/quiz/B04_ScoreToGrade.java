package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float kor = scan.nextInt();
		float en = scan.nextInt(); 
		float math = scan.nextInt();
		
		float avg = 0;
		char grade = 'F';
		
		if((kor > 0 && kor < 100) && (en > 0 && en < 100) && (math > 0 && math < 100)){
			avg = (kor + en + math) / 3;
		}
		
		if(avg >= 90) {
			grade = 'A';
		}else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		}
		
		System.out.printf("평균 점수 : %.2f\n등급 : %c", avg, grade);
	}
}
