package inheritance.pack;

import javax.persistence.Entity;

@Entity
public class Developer extends Emp {
	
	private String projectName;
	private String projectLocation;
	public Developer(long empId, String empName, double empSalary, String emailId, long contactNumber,
			String projectName, String projectLocation) {
		super(empId, empName, empSalary, emailId, contactNumber);
		this.projectName = projectName;
		this.projectLocation = projectLocation;
	}

	

}
