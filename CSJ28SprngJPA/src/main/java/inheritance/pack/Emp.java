package inheritance.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Emp {
	@Id
private long empId;
private String empName;
private double empSalary;
private String emailId;
private long contactNumber;
public Emp(long empId, String empName, double empSalary, String emailId, long contactNumber) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
	this.emailId = emailId;
	this.contactNumber = contactNumber;
}
public long getEmpId() {
	return empId;
}
public String getEmpName() {
	return empName;
}
public double getEmpSalary() {
	return empSalary;
}
public String getEmailId() {
	return emailId;
}
public long getContactNumber() {
	return contactNumber;
}





}
