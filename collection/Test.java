package com.prince.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/prince/spring/collection/config.xml");
		Hospital h= (Hospital)ctx.getBean("Hospital");
		System.out.println(h);
	}

}
