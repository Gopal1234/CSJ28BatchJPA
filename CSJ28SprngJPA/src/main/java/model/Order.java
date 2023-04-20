package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Order_Table")
public class Order {
	@Id
	@GeneratedValue
	private long orderId;
	private LocalDate orderDate;
	private String orderName;
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	
	
	
	
	
	 @JoinTable(
        name = "Order_Product", 
        joinColumns = { @JoinColumn(name = "order_id") }, 
        inverseJoinColumns =
    { @JoinColumn(name = "product_id") })
	    
	@ManyToMany()
	private Set<Product> products=new HashSet<Product>();
	
	
	
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	
	
	
	
	
	
	

}
