package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_table")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="stud_id")
	private long studentId;
	@Column(name="stud_name")
	private String studentName;
	@Column(name="stud_phone", unique = true)
	private long studentPhone;
	@Column(name="stud_mail" ,unique = true)
	private String studentEmail;;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
			
	public Student( String studentName, long studentPhone, 
			String studentEmail) {
		super();
		
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentEmail = studentEmail;
	}
	
	
	
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	public long getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public String getStudentEmail() {
		return studentEmail;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentEmail=" + studentEmail + "]";
	}
	

}
