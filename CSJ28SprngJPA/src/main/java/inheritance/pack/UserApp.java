package inheritance.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserApp {

	public static void main(String[] args) {
	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Admin adminObj1=new Admin(1, "abc", "admin@123");
		Trainer trainerObj=new Trainer(2, "xyz", "xyz@123");
		em.persist(adminObj1);
		em.persist(trainerObj);
       em.getTransaction().commit();		
		
		
		
		
	}

}
