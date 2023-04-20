package inheritance.pack;

import javax.persistence.Entity;

@Entity
public class TechnicalCourse extends Course {

	private boolean isPractical;

	public TechnicalCourse(int courseId, String courseName, double coursePrice, boolean isPractical) {
		super(courseId, courseName, coursePrice);
		this.isPractical = isPractical;
	}
	

}
