package com.prince.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int id;
	@Autowired()
	//@Qualifier("address1")
	private Address address1;
	
	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address1 = address;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address1 + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address1;
	}
	
	public void setAddress(Address address) {
		this.address1 = address;
	}
	
	
}
