package inheritance.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Developer dev=
new Developer(109, "Ravi", 50000.00, "ravi@gmail.com", 8147117572L, "web project", "kolkata");
		Manager manager =
new Manager(198, "Ankit", 90000.00, "ankit@gmail.com", 12346789L, "dev team");
		
		em.persist(dev);
		em.persist(manager);
		em.getTransaction().commit();
		
		
		
	}

}
