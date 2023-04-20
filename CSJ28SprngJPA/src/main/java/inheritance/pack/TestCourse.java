package inheritance.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		TechnicalCourse tc=new TechnicalCourse(1, "java fsd", 15000.00, true);
		NonTechnical ntc=new NonTechnical(2, "History", 2000.00, 40);
		em.persist(tc);
           em.persist(ntc);
           em.getTransaction().commit();
		
	}

}
