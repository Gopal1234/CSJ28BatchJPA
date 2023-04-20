package inheritance.pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("trainer")
public class Trainer  extends User{

	public Trainer(int id, String userName, String userPassword) {
		super(id, userName, userPassword);
		// TODO Auto-generated constructor stub
	}

}
