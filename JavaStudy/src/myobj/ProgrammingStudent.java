package myobj;

public class ProgrammingStudent {
	static String[] lastNameCandidates = { "김", "이", "박", "최" };
	static String[] firstNameCandidates = { "영", "철", "수", "지", "민", "식", "시", "은" };
	
	static int stuCount = 1;

	String name, stuNum, stuName;
	int kor, eng, math, c, op, ds;

	public ProgrammingStudent() {
		this.kor = getRandomScore();
		this.eng = getRandomScore();
		this.math = getRandomScore();
		this.c = getRandomScore();
		this.op = getRandomScore();
		this.ds = getRandomScore();
		this.stuNum = String.format("EZEN%06d", stuCount++);
		this.stuName = getRandomName();
	}

	public static int getRandomScore() {
		return (int) (Math.random() * 101);
	}
	
	public static String selectRandomOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}
	
	public static String getRandomName2() {
		return selectRandomOne(lastNameCandidates)
				+ selectRandomOne(firstNameCandidates)
				+ selectRandomOne(firstNameCandidates);
	}

	public static String getRandomName() {
		return lastNameCandidates[(int) (Math.random() * lastNameCandidates.length)]
				+ firstNameCandidates[(int) (Math.random() * firstNameCandidates.length)]
				+ firstNameCandidates[(int) (Math.random() * firstNameCandidates.length)];
	}
	
	public static void printDetail(ProgrammingStudent stu) {
		System.out.println("-------------------");
		System.out.println("학번 : " + stu.stuNum);
		System.out.println("이름 : " + stu.stuName);
		System.out.println("-------------------");
		System.out.println("국어 : " + stu.kor);
		System.out.println("영어 : " + stu.eng);
		System.out.println("수학 : " + stu.math);
		System.out.println("C언어 : " + stu.c);
		System.out.println("운영체제 : " + stu.op);
		System.out.println("자료구조 : " + stu.ds);
		System.out.println("-------------------");
	}
	
	@Override
	public String toString() {
		return String.format("%s\t/%s", stuNum, stuName);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			ProgrammingStudent stu = new ProgrammingStudent();
			
			ProgrammingStudent.printDetail(stu);
		}
	}

}