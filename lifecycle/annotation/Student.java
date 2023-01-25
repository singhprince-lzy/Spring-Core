package com.prince.spring.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//init method and destroy method using annotation
	@PostConstruct
	public void initMethod() {
		System.out.println("It is call to init method");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("It is call to destroy method");
	}
	
	
}
