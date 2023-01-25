package com.prince.spring.autowire;

public class Address {
	private String city;
	private String street;
	private int Hno;
	public Address(String city, String street, int hno) {
		super();
		this.city = city;
		this.street = street;
		Hno = hno;
	}
	public Address() {
		super();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", Hno=" + Hno + "]";
	}
	
}
