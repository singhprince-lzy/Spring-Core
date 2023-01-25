package com.prince.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/prince/spring/propertyplaceholder/config.xml");
		MyDao myDao=(MyDao)ctx.getBean("MyDAO");
		System.out.println(myDao);
	}

}
