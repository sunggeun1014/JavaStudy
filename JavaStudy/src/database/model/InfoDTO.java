package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class InfoDTO {
	
	private Integer employee_id; 
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private Float salary;
	private Float commission_pct;
	private Integer manager_id;
	private Integer department_id;
	
	private String department_name;
	private Integer location_id;
	
	public InfoDTO(ResultSet rs) throws SQLException {
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		last_name = rs.getString("last_name");
		email = rs.getString("email");
		phone_number = rs.getString("phone_number");
		hire_date = rs.getDate("hire_date");
		job_id = rs.getString("job_id");
		salary = rs.getFloat("salary");
		commission_pct = rs.getFloat("commission_pct");
		manager_id = rs.getInt("manager_id");
		department_id = rs.getInt("department_id");
		department_name = rs.getString("department_name");
		location_id = rs.getInt("location_id");
	}
	
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Float getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(Float commission_pct) {
		this.commission_pct = commission_pct;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	@Override
	public String toString() {
		return "InfoDTO [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", hire_date=" + hire_date + ", job_id="
				+ job_id + ", salary=" + salary + ", commission_pct=" + commission_pct + ", manager_id=" + manager_id
				+ ", department_id=" + department_id + ", department_name=" + department_name + ", location_id="
				+ location_id + "]";
	}
	
	
}
