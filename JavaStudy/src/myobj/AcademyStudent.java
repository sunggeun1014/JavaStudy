package myobj;

public class AcademyStudent {
	
	private static NameGenerator nameGenerator = new NameGenerator(); 
	private static StunumGenerator stunumGenerator = new StunumGenerator("EZEN");  

	private String stuName;
	private String stuNum;

	protected AcademyStudent() {
		this.stuName = nameGenerator.generate();
		this.stuNum = stunumGenerator.generate();
	}
	
	public static void printDetail(AcademyStudent stu) {
		System.out.println("-------------------");
		System.out.println("학번 : " + stu.stuNum);
		System.out.println("이름 : " + stu.stuName);
		System.out.println("-------------------");
		System.out.println(stu.getScores());
		System.out.println("총점 : " + stu.getTotal());
		System.out.println("평균 : " + stu.getAvg());
		System.out.println("등급 : " + stu.getGrade());
		System.out.println("-------------------");
	}
	
	protected static int generateRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	public String getScores() {
		return null;
	}
	
	public int getTotal() {
		return -1;
	}
	
	public double getAvg() {
		return -1.0;
	}
	
	public String getGrade() {
		double avg = getAvg();
		
		if(avg >= 90) {
			return "A";
		}else if(avg >= 80) {
			return "B";
		}else if(avg >= 70) {
			return "C";
		}else if(avg >= 60) {
			return "D";
		}else {
			return "F";
		}
	}

	public String getStuName() {
		return this.stuName;
	}
	
	public String getStuNum() {
		return this.stuNum;
	}

}
