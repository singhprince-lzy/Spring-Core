package com.prince.spring.interfaces.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext(
				"com/prince/spring/interfaces/injection/config.xml");
		OrderBo o=(OrderBo) ct.getBean("orderBo");
		o.placeOrder();
		
	}

}
