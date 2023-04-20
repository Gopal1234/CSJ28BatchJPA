package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//Using entity we can create the table name as same of class name
@Entity
@Table(name="EMPLOYEE_TABLE")
public class Employee {
	//@Id is used to create primary key for relation or entity
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private int empId;
	@Column(name="EMP_NAME")
	private String empName;
	@Column(name="EMP_PHONE", unique = true,nullable =false)
	private long empPhone;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Task task;
	
	
	
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	
	
	

}
