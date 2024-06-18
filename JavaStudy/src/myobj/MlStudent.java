package myobj;

public class MlStudent extends AcademyStudent {
	static String[] subjectNames = {"국어", "영어", "수학", "통계학", "파이썬", "NO-SQL"};
	int[] scores = new int[6];
	
	public MlStudent() {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = generateRandomScore();
		}
	}
	
	@Override
	public int getTotal() {
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / (double)scores.length;
	}
	
	@Override
	public String getScores() {
		String str = "";
		
		for (int i = 0; i < scores.length; i++) {
			str += String.format("%s: %d\n", subjectNames[i], scores[i]);
		}
		return str;
	}
	
}
