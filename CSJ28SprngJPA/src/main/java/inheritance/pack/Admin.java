package inheritance.pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User {

	public Admin(int id, String userName, String userPassword) {
		super(id, userName, userPassword);
		// TODO Auto-generated constructor stub
	}

}
