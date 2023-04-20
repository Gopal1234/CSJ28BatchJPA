package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="FlipKart_Product")
public class Product {
	@Id
	@GeneratedValue
private long productId;
private String productName ;
private double productPrice;
@ManyToMany()
private Set<Order> orders=new HashSet<Order>();

public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public Set<Order> getOrders() {
	return orders;
}
public void setOrders(Set<Order> orders) {
	this.orders = orders;
}



}
