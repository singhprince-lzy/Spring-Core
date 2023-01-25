package com.prince.spring.autowire;

public class Employee {
	
	private int id;
	private Address address;
	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
