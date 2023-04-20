package inheritance.pack;

import javax.persistence.Entity;

@Entity
public class Manager extends Emp {

	
	private String teamName;

	public Manager(long empId, String empName, double empSalary, String emailId, long contactNumber, String teamName) {
		super(empId, empName, empSalary, emailId, contactNumber);
		this.teamName = teamName;
	}
	
	
}
