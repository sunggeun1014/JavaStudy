package myobj;

public class NetworkStudent extends AcademyStudent {
	
	int kor;
	int eng;
	int linux;
	int network;
	int ccna;
	
	public NetworkStudent() {
		super();
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		network = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\n영어: %d\n리눅스: %d\n네트워크: %d\nCCNA: %d\n", kor, eng, linux, network, ccna);
	}
	
	

	
}
