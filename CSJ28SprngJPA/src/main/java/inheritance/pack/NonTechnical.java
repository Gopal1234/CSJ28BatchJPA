package inheritance.pack;

import javax.persistence.Entity;

@Entity
public class NonTechnical extends Course {


private int noOfLecture;

public NonTechnical(int courseId, String courseName, double coursePrice, int noOfLecture) {
	super(courseId, courseName, coursePrice);
	this.noOfLecture = noOfLecture;
}





}
