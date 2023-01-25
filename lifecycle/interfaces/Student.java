package com.prince.spring.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
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
	
	//init method and destroy method 
//	public void initMethod() {
//		System.out.println("It is call to init method");
//	}
//	
//	public void destroyMethod() {
//		System.out.println("It is call to destroy method");
//	}
	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean ");
		
	}
	
}
