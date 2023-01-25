package com.prince.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/prince/spring/springcore/constructorinjection/config.xml");
		Employee e=(Employee)context.getBean("Employee");
		Address a= (Address)context.getBean("Address");
		Address a1= (Address)context.getBean("Address");
		System.out.println(e);
		System.out.println(a.hashCode()+"=="+a1.hashCode()+" "+(a==a1));
	}

}
