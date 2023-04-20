package model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class CustomerApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Customer cust1=new Customer();
		cust1.setCustomerId(16758L);
		cust1.setCustomerName("abc");
		cust1.setCustomerPhone(4566);
		
		
		Order order1=new Order();
		//order1.setOrderId(1818);
		order1.setOrderName("abcd");
		order1.setOrderDate(LocalDate.now());
		order1.setCustomer(cust1);
		
		Order order2=new Order();
		//order2.setOrderId(2828);
		order2.setOrderName("xyzt");
		order2.setOrderDate(LocalDate.now());
		order2.setCustomer(cust1);
		
		cust1.getListOfOrder().add(order1);
		cust1.getListOfOrder().add(order2);
		//**********************************
		Product product1=new Product();
	Set<Order> set1=product1.getOrders();
	set1.add(order1);
		product1.getOrders().add(order2);
		product1.setOrders(product1.getOrders());
		product1.setProductName("HP laptop");
		product1.setProductPrice(76889);
		
		Product product2=new Product();
		product2.getOrders().add(order1);
		
		product2.setOrders(product1.getOrders());
		product2.setProductName("DEll laptop");
		product2.setProductPrice(75589);
		
		order1.getProducts().add(product1);
		order1.getProducts().add(product2);
		order1.setProducts(order1.getProducts());
		 em.persist(cust1);
		em.persist(product1);
		em.persist(product2);
		//em.persist(order1);
		//em.persist(order2);
		em.getTransaction().commit();
	}

}
