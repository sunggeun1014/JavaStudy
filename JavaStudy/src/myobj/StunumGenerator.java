package myobj;

public class StunumGenerator {
	String academyName;
	int generateCount = 0;
	
	public StunumGenerator(String academyName) {
		this.academyName = academyName;
	}
	
	public String generate() {
		return String.format("%s%06d", academyName, generateCount++);
	}
}
