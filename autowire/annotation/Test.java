package com.prince.spring.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/prince/spring/autowire/annotation/config.xml");
		Employee e=(Employee)context.getBean("Employee");
		
		System.out.println(e);
		
	}

}
