package myobj;

public class Reporter {
	String name;
	String company;
	String field;
	String email;
	
	public Reporter(String name, String company, String field, String email) {
		this.name = name;
		this.company = company;
		this.field = field;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("%s 기자/%s/%s/%s", name, company, field, email);
	}
	
}
