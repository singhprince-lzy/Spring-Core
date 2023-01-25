package com.prince.spring.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/prince/spring/stereotype/annotation/config.xml");
		Instructor instructor=(Instructor) ct.getBean("Instructor");
		//Instructor instructor1=(Instructor) ct.getBean("Instructor");
		System.out.println(instructor);
	}

}
