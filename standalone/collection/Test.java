package com.prince.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/prince/spring/standalone/collection/config.xml");
		ProductList productList=(ProductList) ct.getBean("productList");
		System.out.println(productList);
	}

}
