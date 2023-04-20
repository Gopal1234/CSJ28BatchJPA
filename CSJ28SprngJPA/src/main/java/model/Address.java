package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@SequenceGenerator(name = "address_seq", initialValue = 1001, allocationSize = 5)
	@GeneratedValue(generator ="address_seq" )
	private int addressId;

}
