package myobj;

public class NameGenerator {
	private String[] lastNameCandidates = { "김", "이", "박", "최" };
	private String[] firstNameCandidates = { "영", "철", "수", "지", "민", "식", "시", "은" };

	
	public void setLastNameCaindidates(String... lastNames) {
		this.lastNameCandidates = lastNames;
	}
	
	public void setFirstNameCaindidates(String... firstNames) {
		this.firstNameCandidates = firstNames;
	}
	
	private String selectRandomOne(String[] arr) {
		return arr[(int)(Math.random() * arr.length)];
	}
	
	public String generate() {
		return selectRandomOne(lastNameCandidates)
				+ selectRandomOne(firstNameCandidates)
				+ selectRandomOne(firstNameCandidates);
	}

}
