package inheritance.pack;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Course {
	@Id
	private int courseId;
	private String courseName;
	private double coursePrice;
	public Course(int courseId, String courseName, double coursePrice) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	};
	
	
	

}
